package com.uilangage.langcine.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.test.domain.Test;
import com.uilangage.langcine.test.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepository;

	public List<String> createMovieTime(int number) {
		
		int oneTime = number + 10;
		int count = 1020/(oneTime) + 1;
		List<String> timeList = new ArrayList<>();
		int openTime = 540;
		for(int i = 0; i < count; i++ ) {
			if(i == 0) {
				timeList.add("09:00");
			}else {
				int minuteTime = openTime + (oneTime * i);
				int hour = minuteTime / 60;
				if(hour > 24) {
					hour = hour - 24;
				}
				int minute = minuteTime % 60;
				timeList.add(hour + " : " + minute);
			}
		}
		return timeList;
	}
		public void addTest(int number) {
		
			int oneTime = number + 10;
			int count = 1020/(oneTime) + 1;
			List<String> timeList = new ArrayList<>();
			int openTime = 540;
			for(int i = 0; i < count; i++ ) {
				if(i == 0) {
					timeList.add("09:00");
				}else {
					int minuteTime = openTime + (oneTime * i);
					int hour = minuteTime / 60;
					if(hour > 24) {
						hour = hour - 24;
					}
					int minute = minuteTime % 60;
					timeList.add(hour + " : " + minute);
				}
			}
			
			for(int i = 0; i < timeList.size(); i++ ) {
				Test test = Test.builder()
						.testlist(timeList.get(i))
						.build();
				testRepository.save(test);
				
			}
			
		
	}
	
	
	
}
