package com.uilangage.langcine.admin.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;
import com.uilangage.langcine.admin.movie.repository.ScreeningMovieRepository;

@Service
public class ScreeningMovieService {
	@Autowired
	private ScreeningMovieRepository screeningMovieRepository;
	
	@Autowired
	private RunningTimeService runningTimeService;

	
	public List<ScreeningMovie> findTheaterIdByMovieId(int movieId) {
		List<ScreeningMovie> screeningMovie = screeningMovieRepository.findByTheaterIdMovieId(movieId);
		 return screeningMovie;
	}
	
	
	
	
	
	public boolean addMovieScreen(int theaterNumber, int movieNumber) {
	
		
		List<String> movieTimeList = runningTimeService.createMovieTime(movieNumber);
		
		for(int i = 0; i < movieTimeList.size(); i++ ) {
			ScreeningMovie screenMoive = ScreeningMovie.builder()
										.theaterId(theaterNumber)
										.movieId(movieNumber)
										.movieTime(movieTimeList.get(i))
										.build();
			screeningMovieRepository.save(screenMoive);

			
		}
		return true;
		
		
	}
	

}
