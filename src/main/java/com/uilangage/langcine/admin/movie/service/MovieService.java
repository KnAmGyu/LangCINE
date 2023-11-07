package com.uilangage.langcine.admin.movie.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;
import com.uilangage.langcine.admin.movie.dto.AdminTheaterListDetail;
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
	
	public List<Movie> getMovieByExposure(){
		return movieRepository.getMovieByList(); 
	}
	
	public int addMovie(
			int managerId
			, String movieName
			, MultipartFile thumbImage
			, MultipartFile visualImage
			, MultipartFile bannerImage
			, String genre
			, String director
			, String star
			, String story
			, int runningTime
			, String openDay
			, String exposure){
		
		String thumb = FileManager.saveFile(managerId, thumbImage);
		String visual = FileManager.saveFile(managerId, visualImage);
		String banner = FileManager.saveFile(managerId, bannerImage);
		
		
		return movieRepository.insertMovie(managerId, movieName, thumb, visual, banner, genre, director, star, story, runningTime, openDay, exposure);
		
		
		
	}
	
	
	
}
