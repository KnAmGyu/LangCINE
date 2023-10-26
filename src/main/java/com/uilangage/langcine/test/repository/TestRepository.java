package com.uilangage.langcine.test.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository {

	
	
	public int inserTest(@Param("test") List<String> test);
}
