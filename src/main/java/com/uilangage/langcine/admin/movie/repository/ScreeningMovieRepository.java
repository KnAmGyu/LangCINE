package com.uilangage.langcine.admin.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;

@Repository
public interface ScreeningMovieRepository extends JpaRepository<ScreeningMovie, Integer>  {

	
	public List<ScreeningMovie> findByTheaterIdMovieId(int movieId);
	
}
