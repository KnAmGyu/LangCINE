package com.uilangage.langcine.like.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository {

	public int addLike(
			@Param("movieId") int movieId
			, @Param("userId") int userId);
	
	public int deleteLikeByMovieIdAndUserId(
			@Param("movieId") int movieId
			, @Param("userId") int userId);
	
	public int selectCountLike(
			@Param("movieId") int movieId);
	
	public int selectCountLikeByUserId(
			@Param("movieId") int movieId
			, @Param("userId") int userId);
	
	
}
