package com.uilangage.langcine.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloTestController {

	
	@ResponseBody
	@RequestMapping("/hello")
	public String hellotest() {
		return "Hello World!!";
	}
}
