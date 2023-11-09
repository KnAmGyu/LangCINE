package com.uilangage.langcine.movie.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.movie.domain.Movie;
import com.uilangage.langcine.admin.movie.repository.MovieRepository;
import com.uilangage.langcine.movie.dto.MovieDetail;

@Service
public class MainMovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public MovieDetail getMovieInfo(int id){
		
		 movieRepository.getMovieInfo(id);
	}
	
}
