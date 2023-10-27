package com.uilangage.langcine.admin.manager;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class ManagerController {

	@GetMapping("/login-view")
	public String loginInput(){
		return "admin/manager/login";
	}
	

	

	
	
	@GetMapping("/join-view")
	public String joinInput() {
		return "admin/manager/join";
	}
	
}
