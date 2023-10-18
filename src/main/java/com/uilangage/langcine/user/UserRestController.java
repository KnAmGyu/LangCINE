package com.uilangage.langcine.user;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserRestController {

	
	
	@PostMapping("/join")
	public Map<String, String> join(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, @RequestParam("name") String name
			, @RequestParam("nickName") String nickName
			, @RequestParam("email") String email
			, @RequestParam("phoneNumber") String phoneNumber){
		
	}
	
	
	
}
