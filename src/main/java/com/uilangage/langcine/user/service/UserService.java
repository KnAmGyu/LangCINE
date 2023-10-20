package com.uilangage.langcine.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.common.EncryptUtils;
import com.uilangage.langcine.common.SHA256Util;
import com.uilangage.langcine.user.domain.Salt;
import com.uilangage.langcine.user.domain.User;
import com.uilangage.langcine.user.repository.SaltRepository;
import com.uilangage.langcine.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SaltRepository saltRepository;
	
	
	public User getUser(String loginId, String userPassword) {
		
		
		String salt = saltRepository.selectSalt(loginId).getSalt();
		
		String password = SHA256Util.getEncrypt(userPassword, salt);
//		String encryptString = EncryptUtils.md5(userPassword);
//		
//		User user = userRepository.findByLoginIdAndUserPassword(loginId, encryptString).orElse(null);
		 
//		return user;
	
	}
	
	public int addUser(
			String loginId
			, String userPassword
			, String userName
			, String email
			, String phoneNumber) {
		
		
		String saltNumber = SHA256Util.generateSalt();
		
		saltRepository.addSalt(loginId, saltNumber);
		
		String encryptPassword = SHA256Util.getEncrypt(userPassword, saltNumber);
		
		return userRepository.addUser(loginId, encryptPassword, userName, email, phoneNumber);
		
	
		 
		
	}
}
