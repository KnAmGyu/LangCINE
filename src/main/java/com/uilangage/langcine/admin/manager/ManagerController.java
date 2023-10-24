package com.uilangage.langcine.admin.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class ManagerController {

	@GetMapping("/login-view")
	public String loginInput(){
		return "admin/manager/login";
	}
	

	
	@GetMapping("/main-view")
	public String mainInput(){
		return "admin/manager/admin-main";
	}
	
	
	@GetMapping("/join-view")
	public String joinInput() {
		return "admin/manager/join";
	}
	
}
