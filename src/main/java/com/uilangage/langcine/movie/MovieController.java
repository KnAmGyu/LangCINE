package com.uilangage.langcine.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.service.MovieService;

@Controller
@RequestMapping("/langcine")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	
	@GetMapping("/main-view")
	public String mainView(Model model) {
		
		
		List<Movie> movieList = movieService.getMovie();
		
		model.addAttribute("movie", movieList);
		
		return "movie/main";
	}
}
