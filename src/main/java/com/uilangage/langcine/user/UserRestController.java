package com.uilangage.langcine.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uilangage.langcine.user.domain.User;
import com.uilangage.langcine.user.service.UserService;

@RequestMapping("/user")
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/join")
	public Map<String, String> join(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, @RequestParam("name") String userName
			, @RequestParam("nickName") String nickName
			, @RequestParam("email") String email
			, @RequestParam("phoneNumber") String phoneNumber){
		
		User user = userService.addUser(loginId, password, userName, nickName, email, phoneNumber);
		
		Map<String, String> resultMap = new HashMap<>();
		if(user != null) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
		
	}
	
	
	
}
