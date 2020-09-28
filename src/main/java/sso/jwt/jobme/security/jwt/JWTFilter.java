package sso.jwt.jobme.security.jwt;

import com.google.common.base.Strings;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;
import sso.jwt.jobme.web.ApplicationResource;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Filters incoming requests and installs a Spring Security principal if a header corresponding to a valid user is
 * found.
 */
public class JWTFilter extends GenericFilterBean {

    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String AUTHORIZATION_TOKEN = "access_token";

    private final static String DOMAIN_CAS = ApplicationResource.getMessage("DOMAIN_CAS");

    private final static String HTTPS = ApplicationResource.getMessage("HTTPS");

    private final TokenProvider tokenProvider;

    public JWTFilter(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
        throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String ticket = httpServletRequest.getParameter("ticket");
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String ipHost = HTTPS + "://" + httpServletRequest.getServerName();
        if (httpServletRequest.getServerPort() != 80 && httpServletRequest.getServerPort() != 443) {
            ipHost += ":" + httpServletRequest.getServerPort();
        }
        HttpSession session = httpServletRequest.getSession();

        if(!Strings.isNullOrEmpty(ticket)){
            String jwt =  tokenProvider.authenByTicketFromCas(httpServletRequest, resp, ticket, DOMAIN_CAS, ipHost);
            Cookie cookie = new Cookie(AUTHORIZATION_HEADER, jwt);
            session.setAttribute(AUTHORIZATION_TOKEN, jwt);
            resp.setHeader(AUTHORIZATION_HEADER, jwt);
            resp.addCookie(cookie);
            resp.sendRedirect(httpServletRequest.getContextPath() + "/");
        }else {
            String jwt = resolveToken(httpServletRequest);
            if (StringUtils.hasText(jwt) && this.tokenProvider.validateToken(jwt)) {
                Authentication authentication = this.tokenProvider.getAuthentication(jwt);
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    private String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader(AUTHORIZATION_HEADER);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        String jwt = request.getParameter(AUTHORIZATION_TOKEN);
        if (StringUtils.hasText(jwt)) {
            return jwt;
        }
        return null;
    }
}
