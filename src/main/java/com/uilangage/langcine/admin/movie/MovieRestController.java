package com.uilangage.langcine.admin.movie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.service.MovieService;

@RestController
public class MovieRestController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("movie/screen")
	public Map<String, String> screeningMovie(
			@RequestParam("movieNumber")int movieNumber
			){
		
		
	}
	
	
	@PostMapping("/movie/create")
	public Map<String, String> createMovie(
			@RequestParam("movieName") String movieName
			, @RequestParam(value="thumbImage", required=false) MultipartFile thumbImage
			, @RequestParam(value="movieInfoImage", required=false) MultipartFile movieInfoImage
			, @RequestParam(value="visualImage", required=false) MultipartFile visualImage
			, @RequestParam(value="bannerImage", required=false) MultipartFile bannerImage
			, @RequestParam("genre") String genre
			, @RequestParam("director") String director
			, @RequestParam("star") String star
			, @RequestParam("story") String story
			, @RequestParam("runningTime") int runningTime
			, @RequestParam("openDay") String openDay
			, HttpSession session){
		
		int managerId = (Integer)session.getAttribute("managerId");
		
		int count = movieService.addMovie(managerId, movieName, thumbImage, movieInfoImage, visualImage, bannerImage, genre, director, star, story, runningTime, openDay);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	}
	
	
}
