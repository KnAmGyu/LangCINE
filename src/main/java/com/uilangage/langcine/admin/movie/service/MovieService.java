package com.uilangage.langcine.admin.movie.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.repository.MovieRepository;
import com.uilangage.langcine.common.FileManager;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public int getRunningTime(int id) {
		return movieRepository.getMovieInfo(id).getRunningTime();
	}
	
	public List<Movie> getMovie(){
		return movieRepository.getMovie(); 
	}
	
	public int addMovie(
			int managerId
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
		
		String thumb = FileManager.saveFile(managerId, thumbImage);
		String movieInfo = FileManager.saveFile(managerId, movieInfoImage);
		String visual = FileManager.saveFile(managerId, visualImage);
		String banner = FileManager.saveFile(managerId, bannerImage);
		
		
		return movieRepository.insertMovie(managerId, movieName, thumb, movieInfo, visual, banner, genre, director, star, story, runningTime, openDay);
		
		
		
	}
	
	
	
}
