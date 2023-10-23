package com.uilangage.langcine.admin.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.langcine.admin.manager.domain.Manager;
import com.uilangage.langcine.admin.manager.repository.ManagerRepository;
import com.uilangage.langcine.admin.manager.repository.ManagerSaltRepository;
import com.uilangage.langcine.common.SHA256Util;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private ManagerSaltRepository managerSaltRepository;
	
	
	public Manager getManager(String adminId, String adminPassword) {
		
		
		String salt = managerSaltRepository.selectSalt(adminId).getSalt();
		
		String password = SHA256Util.getEncrypt(adminPassword, salt);

		return managerRepository.selectManager(adminId, password);
		
	
	}
	
	
	public int addManager(
			String adminId
			, String managerName
			, String adminPassword) {
		
		
		String saltNumber = SHA256Util.generateSalt();
		
		managerSaltRepository.addSalt(adminId, saltNumber);
		
		String encryptPassword = SHA256Util.getEncrypt(adminPassword, saltNumber);
		
		return managerRepository.addManager(adminId, managerName, encryptPassword);
		
	
		 
		
	}
	
}
