package com.uilangage.langcine.admin.movie.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Convert;

import com.uilangage.langcine.common.StringArrayConverter;

public class Movie {

	private int id;
	private String movieName;
	private String thumbImage;
	private String movieInfoImage;
	private String visualImage;
	private String bannerImage;
	private String genre;
	private String director;
	
	@Convert(converter = StringArrayConverter.class)
	private List<String> star;
	private String story;
	private int runningTime;
	private Date openDay;
	private Date createdAt;
	private Date updatedAt;
	
	
}
