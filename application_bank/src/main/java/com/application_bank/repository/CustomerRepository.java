package com.application_bank.repository;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.application_bank.pojo.Customer;
import java.lang.Integer;
import java.util.List;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>   {
	List<Customer> findAllByCustomeridAndPassword(Integer  customerid, String password);
	
}
