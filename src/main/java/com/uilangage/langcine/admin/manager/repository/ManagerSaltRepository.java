package com.uilangage.langcine.admin.manager.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.user.domain.Salt;

@Repository
public interface ManagerSaltRepository {

	public int addSalt(
			@Param("adminId") String adminId
			, @Param("salt") String salt);
	
	public Salt selectSalt(@Param("adminId") String adminId);	
}
