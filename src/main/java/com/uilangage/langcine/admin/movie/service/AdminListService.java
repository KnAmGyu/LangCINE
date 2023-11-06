package com.uilangage.langcine.admin.movie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;
import com.uilangage.langcine.admin.movie.dto.AdminTheaterListDetail;
import com.uilangage.langcine.admin.movie.repository.MovieRepository;

@Service
public class AdminListService {

	@Autowired
	private MovieRepository movieRepository;
	
	
	@Autowired
	private ScreeningMovieService screeningMovieService;
	
	
	
	
	public List<AdminTheaterListDetail> adminListDetail(){
		
		List<Movie> movieList = movieRepository.getMovieByList();
		
		List<AdminTheaterListDetail> adminlList = new ArrayList<>();
		movieloop:
		for(Movie movie:movieList) {
			
			int movieNumber = movie.getId();
			
			int theaterNumber = screeningMovieService.findTheaterIdByMovieId(movieNumber);
			
			if(theaterNumber > 5) {
				break movieloop;
							
				//	adminlList.stop(adminDetail);	
			}
			
			AdminTheaterListDetail adminDetail = AdminTheaterListDetail.builder()
													.id(movie.getId())
													.theaterNumber(theaterNumber)
													.movieId(movieNumber)
													.movieName(movie.getMovieName())
													.build();
					
			adminlList.add(adminDetail);		
		}
		return adminlList;
	}





}
