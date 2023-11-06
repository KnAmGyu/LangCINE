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

	
	
//	리스트의 형태로 받아온 theaterId를 인덱스 0의 값을 객체로 변환후 int변환하기
	public int findTheaterIdByMovieId(int movieId) {
		List<ScreeningMovie> screeningMovie = screeningMovieRepository.findByTheaterIdQuery(movieId);
//		ScreeningMovie number = screeningMovie.get(0);
//		int theaterNumber = number.getTheaterId();
		if(screeningMovie.isEmpty()) {
			return 6;
		}
		int theaterNumber = screeningMovie.get(0).getTheaterId();
		
		return theaterNumber;
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
