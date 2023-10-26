package com.uilangage.langcine.admin.movie.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository {

	
	
	public int insertMovie(
			int userId
			, @Param("movieName") String movieName
			, @Param("thumbImage") String thumbImage
			, @Param("movieInfoImage") String movieInfoImage
			, @Param("visualImage") String visualImage
			, @Param("bannerImage") String bannerImage
			, @Param("genre") String genre
			, @Param("director") String director
			, @Param("star") List<String> star
			, @Param("story") String story
			, @Param("runningTime") int runningTime
			, @Param("openDay") String openDay);
	
	
}
