package com.uilangage.langcine.admin.manager;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uilangage.langcine.admin.manager.domain.Manager;
import com.uilangage.langcine.admin.manager.service.ManagerService;


@RequestMapping("/admin")
@RestController
public class ManagerRestController {
	
	@Autowired
	private ManagerService managerService;
	
	

	@PostMapping("/login")
	public Map<String, String> loginManager(
			@RequestParam("adminId") String adminId
			, @RequestParam("adminPassword") String adminPassword
			, HttpServletRequest request){
		
		Manager manager = managerService.getManager(adminId, adminPassword);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(resultMap != null) {
			HttpSession session = request.getSession();
			
			session.setAttribute("managerId", manager.getId());
			session.setAttribute("managerName", manager.getManagerName());
			
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
	}
	
	
	@PostMapping("/join")
	public Map<String, String> joinManager(
			@RequestParam("adminId") String adminId
			, @RequestParam("managerName") String managerName
			, @RequestParam("adminPassword") String adminPassword){
		
		int count = managerService.addManager(adminId, managerName, adminPassword);
		
		Map<String, String> resultMap = new HashMap<>();
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
		
	}
	
}
