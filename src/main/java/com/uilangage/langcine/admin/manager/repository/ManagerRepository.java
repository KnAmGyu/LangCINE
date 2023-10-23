package com.uilangage.langcine.admin.manager.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.langcine.admin.manager.domain.Manager;

@Repository
public interface ManagerRepository {

	
	public int addManager(
			@Param("adminId") String loginId
			, @Param("managerName") String managerName
			, @Param("adminPassword") String userPassword);
	
	public Manager selectManager(
			@Param("adminId") String adminId
			, @Param("adminPassword") String password);
	
}
