package com.uilangage.langcine.admin.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MovieCotroller {

	
	
	@GetMapping("/movie-view")
	public String movieInput(){
		return "admin/movie/movie-input";
	}	
}
