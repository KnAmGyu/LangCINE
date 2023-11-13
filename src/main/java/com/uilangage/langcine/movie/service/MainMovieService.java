package com.uilangage.langcine.movie.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.repository.MovieRepository;
import com.uilangage.langcine.like.service.LikeService;
import com.uilangage.langcine.movie.dto.MovieDetail;

@Service
public class MainMovieService {

	@Autowired
	private LikeService likeService;
	
	@Autowired
	private MovieRepository movieRepository;
	
	public MovieDetail getMovieInfo(int id){
		
		 Movie movie = movieRepository.getMovieInfo(id);
		 List<String> starList = new ArrayList<String>(Arrays.asList(movie.getStar().split(",")));
		 int likeCount = likeService.countLike(id);
//		 boolean isLike = likeService.isLike(id, loginUserId);
		 MovieDetail movieDetail = MovieDetail.builder()
				 					.id(id)
				 					.movieId(movie.getId())
				 					.movieName(movie.getMovieName())
				 					.thumbImage(movie.getThumbImage())
				 					.visualImage(movie.getVisualImage())
				 					.bannerImage(movie.getBannerImage())
				 					.genre(movie.getGenre())
				 					.director(movie.getDirector())
				 					.star(starList)
				 					.likeCount(likeCount)
//				 					.isLike(isLike)
				 					.story(movie.getStory())
				 					.runningTime(movie.getRunningTime())
				 					.openDay(movie.getOpenDay())
				 					.exposure(movie.getExposure())
				 					.build();
		 return movieDetail;
	}
	
}
