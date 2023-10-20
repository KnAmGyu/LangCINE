package com.uilangage.langcine.user.repository;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.user.domain.User;


@Repository
public interface UserRepository{

	public int addUser(
			@Param("loginId") String loginId
			, @Param("userPassword") String userPassword
			, @Param("userName") String userName
			, @Param("email") String email
			, @Param("phoneNumber") String phoneNumber);
	
	public int selectUser(
			@Param("loginId") String loginId
			, @Param("userPassword") String password);
	
}
