package com.uilangage.langcine.admin.movie.service;

import java.util.ArrayList;
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
	private MovieService movieService;
	
	public List<String> createMovieTime(int movieNumber) {
		int runningTime = movieService.getRunningTime(movieNumber);
		int oneTime = runningTime + 10;
		int count = 1020/(oneTime);
		
		List<String> timeList = new ArrayList<>();
		int openTime = 540;
		for(int i = 0; i < count; i++ ) {
			if(i == 0) {
				timeList.add("09:00");
			}else {
				int minuteTime = openTime + (oneTime * i);
				int hour = minuteTime / 60;
				if(hour < 24) {
					hour = hour - 24;
				}
				int minute = minuteTime % 60;
				timeList.add(hour + " : " + minute);
			}
		}
		return timeList;
	}
	
	
	
	public boolean addMovieScreen(int theaterNumber, int movieNumber) {
	
		
		List<String> movieTimeList = createMovieTime(movieNumber);
		
		for(String time:movieTimeList) {
			ScreeningMovie screenMoive = ScreeningMovie.builder()
											.theaterId(theaterNumber)
											.movieId(movieNumber)
											.movieTime(time)
											.build();
			screeningMovieRepository.save(screenMoive);
			
			return true;
		}
		return false;
		
		
	}
	

}
