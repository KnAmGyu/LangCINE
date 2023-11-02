package com.uilangage.langcine.admin.movie.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AdminTheaterListDetail {

	private int id;
	private int theaterNumber;
	private int movieId;
	private String movieName;
	
	
	
	
}
