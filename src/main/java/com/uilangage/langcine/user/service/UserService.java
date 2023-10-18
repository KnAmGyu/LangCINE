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
	
	
	public User getUser(String loginId, String password) {
		
		
		String encryptString = EncryptUtils.md5(password);
		
		User user = userRepository.findByLoginIdAndPassword(loginId, encryptString).orElse(null);
		 
		return user;
	
	}
	
	public User addUser(
			String loginId
			, String password
			, String userName
			, String nickName
			, String email
			, String phoneNumber) {
		
		
		String encryptPassword = EncryptUtils.md5(password);
		
		User user = User.builder()
						.loginId(loginId)
						.password(encryptPassword)
						.userName(userName)
						.nickName(nickName)
						.email(email)
						.phoneNumber(phoneNumber)
						.build();
	
		return userRepository.save(user);
		
	}
}
