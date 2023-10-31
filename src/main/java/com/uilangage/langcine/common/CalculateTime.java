package com.uilangage.langcine.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uilangage.langcine.admin.movie.service.MovieService;

public class CalculateTime {
	
	@Autowired
	private static MovieService movieService;
	
//	입력받은 영화 id로 러닝타임을 불러온다
//	상영관은 9시부터 새벽 2시까지로 지정한다 9시 - 2시 17시간 1020분
//	청소시간을 10분으로 잡고 러닝타임 + 10분
//  1020분을 받아온 러닝타임으로 나눠 횟수 지정?
	
	

	public static List<String> createMovieTime(int movieNumber) {
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
	
	
}
