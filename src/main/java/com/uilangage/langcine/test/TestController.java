package com.uilangage.langcine.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.langcine.test.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test/test")
	@ResponseBody
	public void createMovieTime(int number) {
		
		testService.addTest(number);
		
	}
}
