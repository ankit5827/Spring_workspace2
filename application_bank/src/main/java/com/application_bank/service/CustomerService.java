package com.application_bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.application_bank.pojo.Customer;
import com.application_bank.repository.CustomerRepository;

@Service
@Component
public class CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer)
	{
		System.out.println("inside service");
		customerRepository.save(customer);
	}
	
	
	

}
