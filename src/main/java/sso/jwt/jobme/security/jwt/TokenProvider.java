package sso.jwt.jobme.security.jwt;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import io.github.jhipster.config.JHipsterProperties;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.client.RestTemplate;
import sso.jwt.jobme.config.Constants;
import sso.jwt.jobme.security.SecurityUtils;
import sso.jwt.jobme.service.dto.UserDTO;
import sso.jwt.jobme.utils.DateUtils;

import static org.springframework.security.web.context.HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY;

@Component
public class TokenProvider {

    private final Logger log = LoggerFactory.getLogger(TokenProvider.class);

    private static final String AUTHORITIES_KEY = "auth";

    private Key key;

    private long tokenValidityInMilliseconds;

    private long tokenValidityInMillisecondsForRememberMe;

    private final JHipsterProperties jHipsterProperties;

    public TokenProvider(JHipsterProperties jHipsterProperties) {
        this.jHipsterProperties = jHipsterProperties;
    }

    @PostConstruct
    public void init() {
        byte[] keyBytes;
        String secret = jHipsterProperties.getSecurity().getAuthentication().getJwt().getSecret();
        if (!StringUtils.isEmpty(secret)) {
            log.warn("Warning: the JWT key used is not Base64-encoded. " +
                "We recommend using the `jhipster.security.authentication.jwt.base64-secret` key for optimum security.");
            keyBytes = secret.getBytes(StandardCharsets.UTF_8);
        } else {
            log.debug("Using a Base64-encoded JWT secret key");
            keyBytes = Decoders.BASE64.decode(jHipsterProperties.getSecurity().getAuthentication().getJwt().getBase64Secret());
        }
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.tokenValidityInMilliseconds =
            1000 * jHipsterProperties.getSecurity().getAuthentication().getJwt().getTokenValidityInSeconds();
        this.tokenValidityInMillisecondsForRememberMe =
            1000 * jHipsterProperties.getSecurity().getAuthentication().getJwt()
                .getTokenValidityInSecondsForRememberMe();
    }

    public String createToken(Authentication authentication, boolean rememberMe) {
        String authorities = authentication.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(","));

        long now = (new Date()).getTime();
        Date validity;
        if (rememberMe) {
            validity = new Date(now + this.tokenValidityInMillisecondsForRememberMe);
        } else {
            validity = new Date(now + this.tokenValidityInMilliseconds);
        }

        return Jwts.builder()
            .setSubject(authentication.getName())
            .claim(AUTHORITIES_KEY, authorities)
            .signWith(key, SignatureAlgorithm.HS512)
            .setExpiration(validity)
            .compact();
    }

    public Authentication getAuthentication(String token) {
        Claims claims = Jwts.parserBuilder()
            .setSigningKey(key)
            .build()
            .parseClaimsJws(token)
            .getBody();

        Collection<? extends GrantedAuthority> authorities =
            Arrays.stream(claims.get(AUTHORITIES_KEY).toString().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        User principal = new User(claims.getSubject(), "", authorities);

        return new UsernamePasswordAuthenticationToken(principal, token, authorities);
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(authToken);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            log.info("Invalid JWT token.");
            log.trace("Invalid JWT token trace.", e);
        }
        return false;
    }

    public String authenByTicketFromCas(HttpServletRequest request, HttpServletResponse response, String ticket, String DOMAIN_CAS, String ipHost) {
        RestTemplate restTemplate = new RestTemplate();
        UserDTO userDTO = new UserDTO();
        String jwt = null;
        Map<String, String> mapResult = SecurityUtils.getEmailFromIAM(DOMAIN_CAS, ipHost, ticket);
        String email = mapResult.get("email");
        System.out.println("=================> " + email);
        JSONObject json = new JSONObject();
        try {
            json.put("email", email);
            json.put("ticket", ticket);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String strToEncrypt = json.toString();
        String encrypted = DateUtils.EncryptionFromBytes(strToEncrypt);
        userDTO.setEncrypt(encrypted);

        //Remove Cookie
        remoteCookie(request, response);

        //Neu email khong ton tai tren he thong SSO
        if(email == null || "".equals(email)){
            //Set Cookie
            String pCookieName = "NO-TICKET";
            Cookie cookie = new Cookie(pCookieName, "valid");
            cookie.setMaxAge(-1);
            cookie.setHttpOnly(false);
            cookie.setPath("/");
        }

        ResponseEntity<UserDTO> responseEntity = restTemplate.postForEntity(ipHost + "/api/public/getUserName", userDTO, UserDTO.class);
        UserDTO userDTO1 = responseEntity.getBody();
        if(userDTO1 != null && userDTO1.getLogin() != null) {
            UsernamePasswordAuthenticationToken authReq = new UsernamePasswordAuthenticationToken(userDTO1.getLogin(), Constants.DEFAULT_PASSWORD);
            SecurityContext sc = SecurityContextHolder.getContext();
            sc.setAuthentication(authReq);
            HttpSession session = request.getSession(true);
            session.setAttribute(SPRING_SECURITY_CONTEXT_KEY, sc);
            jwt = createToken(authReq, true);
            try {
                json.put("email", email);
                json.put("ticket", ticket);
                json.put("jwt", jwt);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            strToEncrypt = json.toString();
            encrypted = DateUtils.EncryptionFromBytes(strToEncrypt);
            userDTO.setEncrypt(encrypted);
            restTemplate.postForEntity(ipHost + "/api/public/updateTicked", userDTO, Void.class);

            //Set Cookie
            String pCookieName = "NO-TICKET";
            Cookie cookie = new Cookie(pCookieName, "SUCCESS");
            cookie.setMaxAge(-1);
            cookie.setHttpOnly(false);
            cookie.setPath("/");
            response.addCookie(cookie);
        }else{
            String pCookieName = "NO-TICKET";
            Cookie cookie = new Cookie(pCookieName, "EMAIL_NOT_EXIST_IN_TCS");
            cookie.setMaxAge(-1);
            cookie.setHttpOnly(false);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
        return jwt;
    }

    private void remoteCookie(HttpServletRequest req, HttpServletResponse resp) {
        Cookie[] cookies = req.getCookies();
        if (cookies != null)
            for (Cookie cookie : cookies) {
                if(cookie.getName() != null && cookie.getName().equals("NO-TICKET")) {
                    cookie.setValue("");
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                }
            }
    }
}
