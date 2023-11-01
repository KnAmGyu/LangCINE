package com.uilangage.langcine.admin.movie.repository;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieRepositoryTest {

	@Autowired
	private MovieRepository movieRepository;
	
//	private Logger logger = LoggerFactory.getLogger(this,getClass());
	
	@Test
	void testGetMovieInfo() {
//		
//		movieRepository.getMovieInfo();
//		
//		logger.info(,toString());
	}

}
