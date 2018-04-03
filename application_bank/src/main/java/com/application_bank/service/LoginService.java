package com.application_bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.application_bank.pojo.Customer;
import com.application_bank.repository.CustomerRepository;

@Service
@Component
public class LoginService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findAllByCustomeridAndPassword(Integer customerid, String password)
	{
		System.out.println("inside service");
		return customerRepository.findAllByCustomeridAndPassword(customerid, password);
	}

}
