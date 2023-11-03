package com.uilangage.langcine.admin.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.movie.domain.ScreeningMovie;

@Repository
public interface ScreeningMovieRepository extends JpaRepository<ScreeningMovie, Integer>  {

	
	
	
//	movieId값에 대응하는 theatId 값 가져와서 리스트 형태로 뿌리기
	@Query(value="SELECT * FROM `screening_info`"
			 + 
			"WHERE `movieId` = :movieId" , nativeQuery=true)
	public List<ScreeningMovie> findByTheaterIdQuery(@Param("movieId") int movieId);
	
}
