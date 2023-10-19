package com.uilangage.langcine.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.common.EncryptUtils;
import com.uilangage.langcine.user.domain.User;
import com.uilangage.langcine.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User getUser(String loginId, String userPassword) {
		
		
		String encryptString = EncryptUtils.md5(userPassword);
		
		User user = userRepository.findByLoginIdAndUserPassword(loginId, encryptString).orElse(null);
		 
		return user;
	
	}
	
	public User addUser(
			String loginId
			, String userPassword
			, String userName
			, String email
			, String phoneNumber) {
		
		
		String encryptPassword = EncryptUtils.md5(userPassword);
		
		User user = User.builder()
						.loginId(loginId)
						.userPassword(encryptPassword)
						.userName(userName)
						.email(email)
						.phoneNumber(phoneNumber)
						.build();
	
		return userRepository.save(user);
		
	}
}
