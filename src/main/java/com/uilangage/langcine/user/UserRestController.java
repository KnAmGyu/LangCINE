package com.uilangage.langcine.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uilangage.langcine.user.domain.User;
import com.uilangage.langcine.user.service.UserService;

@RequestMapping("/user")
@RestController
@Validated
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public Map<String, String> login(
			@RequestParam("loginId") String loginId
			, @RequestParam("userPassword") String userPassword
			, HttpServletRequest request){
		
		User user = userService.getUser(loginId, userPassword);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(resultMap != null) {
			HttpSession session = request.getSession();
			
			session.setAttribute("userId", user.getId());
			session.setAttribute("userName", user.getUserName());
			
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
	}
	
	@PostMapping("/join")
	public Map<String, String> join(
			@Size(min=4, max=16) @RequestParam("loginId") String loginId
			, @RequestParam("userPassword") String userPassword
			, @RequestParam("userName") String userName
			, @Email @RequestParam("email") String email
			, @RequestParam("phoneNumber") String phoneNumber){
		
		int count = userService.addUser(loginId, userPassword, userName, email, phoneNumber);
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
		
	}
	
	
	
}
