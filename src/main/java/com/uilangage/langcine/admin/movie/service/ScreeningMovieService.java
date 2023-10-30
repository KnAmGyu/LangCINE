package com.uilangage.langcine.admin.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.movie.dto.ScreeningMovieDetail;
import com.uilangage.langcine.admin.movie.repository.ScreeningMovieRepository;
import com.uilangage.langcine.admin.movie.repository.TheaterRepository;
import com.uilangage.langcine.common.CalculateTime;

@Service
public class ScreeningMovieService {
	@Autowired
	private ScreeningMovieRepository screeningMovieRepository;
	@Autowired
	private TheaterRepository theaterRepository;
	
	
	public ScreeningMovieDetail addMovieScreen(int theaterNumber, int movieNumber) {
	
		
		List<String> movieTimeList = CalculateTime.createMovieTime(movieNumber);
		for(int i = 0; i < movieTimeList.size(); i++) {
			ScreeningMovieDetail screenMoive = ScreeningMovieDetail.builder()
											.theaterId(theaterNumber)
											.movieId(movieNumber)
											.movieTime(movieTimeList[i + 1])
											.build();
		}
		
//		for(String time:movieTimeList) {
//			ScreeningMovieDetail screenMoive = ScreeningMovieDetail.builder()
//											.theaterId(theaterNumber)
//											.movieId(movieNumber)
//											.movieTime(time)
//											.build();
//			ScreeningMovieRepository.save(screenMoive);
//		}
		
		
	}
	

}
