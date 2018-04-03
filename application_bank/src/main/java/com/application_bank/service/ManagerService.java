package com.application_bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.application_bank.pojo.Manager;
import com.application_bank.repository.ManagerRepository;

@Service
@Component
public class ManagerService {

	
	@Autowired
	private ManagerRepository managerRepository;
	
	public void save(Manager manager)
	{
		System.out.println("inside service");
		managerRepository.save(manager);
	}
	
	
	

}
