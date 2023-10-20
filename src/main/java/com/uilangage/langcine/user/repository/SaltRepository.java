package com.uilangage.langcine.user.repository;



import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.user.domain.Salt;

@Repository
public interface SaltRepository{

	public int addSalt(
			@Param("loginId") String loginId
			, @Param("salt") String salt);
	
	public Salt selectSalt(@Param("loginId") String loginId);
	
}
