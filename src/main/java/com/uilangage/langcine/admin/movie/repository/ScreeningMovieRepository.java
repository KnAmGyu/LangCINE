package com.uilangage.langcine.admin.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.movie.dto.ScreeningMovieDetail;

@Repository
public interface ScreeningMovieRepository extends JpaRepository<ScreeningMovieDetail, Integer>  {

}
