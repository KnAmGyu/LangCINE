package com.uilangage.langcine.movie.dto;

import java.sql.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
@Builder
@Getter
public class MovieDetail {

	private int id;
	private String movieName;
	private String thumbImage;
	private String visualImage;
	private String bannerImage;
	private String genre;
	private String director;
	private List<String> star;
	private String story;
	private int runningTime;
	private Date openDay;
	private String exposure;
}
