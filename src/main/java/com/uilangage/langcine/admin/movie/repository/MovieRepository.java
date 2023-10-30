package com.uilangage.langcine.admin.movie.repository;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.movie.domain.Movie;

@Repository
public interface MovieRepository {

	
	public int getRunnigTime(@Param("id") int id);
	
	
	public List<Movie> getMovie();	
	
	
	
	public int insertMovie(
			@Param("managerId") int managerId
			, @Param("movieName") String movieName
			, @Param("thumbImage") String thumbImage
			, @Param("movieInfoImage") String movieInfoImage
			, @Param("visualImage") String visualImage
			, @Param("bannerImage") String bannerImage
			, @Param("genre") String genre
			, @Param("director") String director
			, @Param("star") String star
			, @Param("story") String story
			, @Param("runningTime") int runningTime
			, @Param("openDay") String openDay);
	
	
}
