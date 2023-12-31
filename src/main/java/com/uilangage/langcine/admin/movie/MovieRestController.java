package com.uilangage.langcine.admin.movie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;
import com.uilangage.langcine.admin.movie.service.MovieService;
import com.uilangage.langcine.admin.movie.service.ScreeningMovieService;

@RestController
public class MovieRestController {

	@Autowired
	private MovieService movieService;

	@Autowired
	private ScreeningMovieService screeningMovieService;
	
	
	@PostMapping("/movie/screen")
	public Map<String, String> screeningMovie(
			@RequestParam("theaterNumber") int theaterNumber
			, @RequestParam("movieNumber")int movieNumber
			){
		boolean ScreenMovie = screeningMovieService.addMovieScreen(theaterNumber, movieNumber);
		
		Map<String, String> resultMap = new HashMap<>();
		if(ScreenMovie) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
		
		
	}
	
	
	@PostMapping("/movie/create")
	public Map<String, String> createMovie(
			@RequestParam("movieName") String movieName
			, @RequestParam(value="thumbImage", required=false) MultipartFile thumbImage
			, @RequestParam(value="visualImage", required=false) MultipartFile visualImage
			, @RequestParam(value="bannerImage", required=false) MultipartFile bannerImage
			, @RequestParam("genre") String genre
			, @RequestParam("director") String director
			, @RequestParam("star") String star
			, @RequestParam("story") String story
			, @RequestParam("runningTime") int runningTime
			, @RequestParam("openDay") String openDay
			, @RequestParam("exposure") String exposure
			, @RequestParam("screening") String screening
			, HttpSession session){
		
		int managerId = (Integer)session.getAttribute("managerId");
		
		int count = movieService.addMovie(managerId, movieName, thumbImage, visualImage, bannerImage, genre, director, star, story, runningTime, openDay, exposure, screening);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	}
	
	
}
