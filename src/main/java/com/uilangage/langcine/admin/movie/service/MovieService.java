package com.uilangage.langcine.admin.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.repository.MovieRepository;
import com.uilangage.langcine.common.FileManager;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public int addMovie(
			int userId
			, String movieName
			, MultipartFile thumbImage
			, MultipartFile movieInfoImage
			, MultipartFile visualImage
			, MultipartFile bannerImage
			, String genre
			, String director
			, String star
			, String story
			, int runningTime
			, String openDay){
		
		String thumb = FileManager.saveFile(userId, thumbImage);
		String movieInfo = FileManager.saveFile(userId, movieInfoImage);
		String visual = FileManager.saveFile(userId, visualImage);
		String banner = FileManager.saveFile(userId, bannerImage);
		
		
		return movieRepository.insertMovie(userId, movieName, thumb, movieInfo, visual, banner, genre, director, star, story, runningTime, openDay);
		
		
		
	}
	
	
	
}
