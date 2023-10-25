package com.uilangage.langcine.admin.movie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.service.MovieService;

@RequestMapping("/admin")
@RestController
public class MovieRestController {

	@Autowired
	private MovieService movieService;
	
	public Map<String, String> createMovie(
			@RequestParam("title") String movieName
			, @RequestParam(value="imageFile", required=false) MultipartFile thumbImage
			, @RequestParam(value="imageFile", required=false) MultipartFile movieInfoImage
			, @RequestParam(value="imageFile", required=false) MultipartFile visualImage
			, @RequestParam(value="imageFile", required=false) MultipartFile bannerImage
			, @RequestParam("genre") String genre
			, @RequestParam("director") String director
			, @RequestParam("star") String star
			, @RequestParam("story") String story
			, @RequestParam("runningTime") int runningTime
			, @RequestParam("openDay") String openDay
			, HttpSession session){
		
		int userId = (Integer)session.getAttribute("userId");
		
		int count = movieService.addMovie(userId, movieName, thumbImage, movieInfoImage, visualImage, bannerImage, genre, director, star, story, runningTime, openDay);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	}
	
	
}
