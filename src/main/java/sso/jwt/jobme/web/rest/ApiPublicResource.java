package sso.jwt.jobme.web.rest;

import java.net.URISyntaxException;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Strings;

import sso.jwt.jobme.service.UserService;
import sso.jwt.jobme.service.dto.UserDTO;
import sso.jwt.jobme.utils.DateUtils;

@RestController
@RequestMapping("/api/public")
public class ApiPublicResource {
	
	private static class AccountResourceException extends RuntimeException {
        private AccountResourceException(String message) {
            super(message);
        }
    }

    private final Logger log = LoggerFactory.getLogger(ApiPublicResource.class);
	
	private final UserService userService;
	
	public ApiPublicResource(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/getUserName")
    public UserDTO getUserName(HttpServletRequest request, HttpServletResponse response, @RequestBody UserDTO userDTO) throws URISyntaxException, JSONException {
        String encrypted = userDTO.getEncrypt();
        if(Strings.isNullOrEmpty(encrypted)){
            return new UserDTO();
        }
        byte[] input = Base64.getDecoder().decode(encrypted);
        String decrypted = DateUtils.DecryptionFromBytes(input);
        JSONObject jsonObj = new JSONObject(decrypted);
        String email = String.valueOf(jsonObj.get("email"));
        List<UserDTO> listUserDTOs =  userService.findByEmail(email);
        if(!listUserDTOs.isEmpty()) return listUserDTOs.get(0);
        else return new UserDTO();
    }
	
	@PostMapping(value = "/updateTicked")
    public void updateTicked(HttpServletRequest request, HttpServletResponse response, @RequestBody UserDTO userDTO) throws URISyntaxException, JSONException {
        String encrypted = userDTO.getEncrypt();
        if(!Strings.isNullOrEmpty(encrypted)) {
	        byte[] input = Base64.getDecoder().decode(encrypted);
	        String decrypted = DateUtils.DecryptionFromBytes(input);
	        JSONObject jsonObj = new JSONObject(decrypted);
	        String email = String.valueOf(jsonObj.get("email"));
	        String ticket = String.valueOf(jsonObj.get("ticket"));
	        String jwt = String.valueOf(jsonObj.get("jwt"));
	        userService.updateTicked(email,ticket, jwt);
	    }
    }
}
