package com.uilangage.langcine.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.service.MovieService;
import com.uilangage.langcine.movie.dto.MovieDetail;
import com.uilangage.langcine.movie.service.MainMovieService;

@Controller
@RequestMapping("/langcine")
public class MovieController {

	@Autowired
	private MainMovieService mainMovieService;
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/detail-view")
	public String movieDetail(@RequestParam("id") int id, Model model) {
		List<MovieDetail> movieInfoList = mainMovieService.getMovieInfo(id);
		model.addAttribute("infoList", movieInfoList);
		return "movie/detail";
	}
	
	
	
	@GetMapping("/info-view")
	public String infoView(Model model) {
		
		
		List<Movie> movieList = movieService.getMovieByExposure();
		
		model.addAttribute("movie", movieList);
		
		return "movie/info";
	}
	
	
	@GetMapping("/main-view")
	public String mainView(Model model) {
		
		
		List<Movie> movieList = movieService.getMovieByExposure();
		
		model.addAttribute("movie", movieList);
		
		return "movie/main";
	}
}
