package com.uilangage.langcine.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.test.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	private int addTest(List<String> test){
		return testRepository.inserTest(test);
	}
}
