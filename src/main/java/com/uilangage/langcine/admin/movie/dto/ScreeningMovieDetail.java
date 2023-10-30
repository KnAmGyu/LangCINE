package com.uilangage.langcine.admin.movie.dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ScreeningMovieDetail {
	
	private int id;
	private int theaterId;
	private int movieId;
	private String movieTime;
	private Date createdAt;
	private Date updatedAt;
	
}
