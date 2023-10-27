package com.uilangage.langcine.admin.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.service.MovieService;

@Controller
@RequestMapping("/admin")
public class MovieCotroller {

	@Autowired
	private MovieService movieService;
	
	
	@GetMapping("/main-view")
	public String mainInput(
			Model model
			){
		
		
		List<Movie> movieList =  movieService.getMovie();
		
		model.addAttribute("movieList", movieList);
		
		return "admin/movie/admin-main";
	}
	
	
	@GetMapping("/movie-view")
	public String movieInput(){
		return "admin/movie/movie-input";
	}	
	
	
	@GetMapping("/theater-view")
	public String theater() {
		return "admin/movie/theater-main";
		}
	}
