package com.uilangage.langcine.like.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.like.repository.LikeRepository;

@Service
public class LikeService {
	@Autowired
	private LikeRepository likeRepository;
	
	public int addLike(int movieId, int userId) {
		return likeRepository.addLike(movieId, userId);
	}

}
