package com.uilangage.langcine.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/langcine")
public class MovieController {

	
	@GetMapping("/main-view")
	public String mainView() {
		return "movie/main";
	}
}
