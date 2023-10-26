package com.uilangage.langcine.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uilangage.langcine.test.service.TestService;

@RequestMapping("/test")
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/create");
	public Map<String, String> createTest(
			@RequestParam(value="test[]") List<String> test)
			){
		int count =  testService.addTest(test);
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	}

}