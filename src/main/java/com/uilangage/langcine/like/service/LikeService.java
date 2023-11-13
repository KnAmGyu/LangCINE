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

	public int deleteLikeByMovieIdAndUserId(int movieId, int userId) {
		return likeRepository.deleteLikeByMovieIdAndUserId(movieId, userId);
	}
	
	public int countLike(int movieId) {
		return likeRepository.selectCountLike(movieId);
	}

	public boolean isLike(int movieId, int userId) {
		int count = likeRepository.selectCountLikeByUserId(movieId, userId);
				
		return count != 0;
	}
	
}
