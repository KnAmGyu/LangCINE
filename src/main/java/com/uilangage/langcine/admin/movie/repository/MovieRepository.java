package com.uilangage.langcine.admin.movie.repository;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.movie.domain.Movie;

@Repository
public interface MovieRepository {

	
	public Movie getMovieInfo(@Param("id") int id);
	
//	개봉일이 오늘날짜보다 뒤에 있을 때
	public List<Movie> getMovieExpected();
	
	public List<Movie> getMovieByExposureScreen();
	
	public List<Movie> getMovie();	
	
	public List<Movie> getMovieByList();
	
	public int insertMovie(
			@Param("managerId") int managerId
			, @Param("movieName") String movieName
			, @Param("thumbImage") String thumbImage
			, @Param("visualImage") String visualImage
			, @Param("bannerImage") String bannerImage
			, @Param("genre") String genre
			, @Param("director") String director
			, @Param("star") String star
			, @Param("story") String story
			, @Param("runningTime") int runningTime
			, @Param("openDay") String openDay
			, @Param("exposure") String exposure
			, @Param("screening") String screening);
	
	
}
