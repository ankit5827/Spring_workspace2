package com.application_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application_bank.pojo.Customer;
import com.application_bank.pojo.Manager;
import com.application_bank.repository.CustomerRepository;
import com.application_bank.service.CustomerService;
import com.application_bank.service.LoginService;

@Controller
public class LoginControllerCustomer {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String customerLogin (Model model)
	{
		model.addAttribute("customer", new Customer() );
		
		return "login";
	}
	
	@RequestMapping(value="/customerhome",method = { RequestMethod.PUT, RequestMethod.POST })
	public String byIdAndPassword (Customer customer,Model model)
	{
		System.out.println(customer);
		Customer c1= (Customer) loginService.findAllByCustomeridAndPassword(customerid,password);
		System.out.println(c1);
		
			return "customerhome";
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
