package com.uilangage.langcine.admin.movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunningTimeService {

	@Autowired
	private MovieService movieService;
	
	public final List<String> createMovieTime(int movieNumber) {
		int runningTime = movieService.getRunningTime(movieNumber);
		int oneTime = runningTime + 10;
		int count = 1020/(oneTime) + 1;
		
		List<String> timeList = new ArrayList<>();
		int openTime = 540;
		for(int i = 0; i < count; i++ ) {
			if(i == 0) {
				timeList.add("09:00");
			}else {
				int minuteTime = openTime + (oneTime * i);
				int hourNumber = minuteTime / 60;
				String hour = null;
				if(hourNumber > 24) {
					hour = ("0" + (hourNumber - 24));
				}else {
					hour = (hourNumber + "");
				}
				int minuteNumber = minuteTime % 60;
				String minute = null;
				if(minuteNumber < 10) {
					minute = ("0" + minuteNumber);
				}else {
					minute = (minuteNumber + "");
				}
				timeList.add(hour + " : " + minute);
			}
		}
		return timeList;
	}
	
	
}
