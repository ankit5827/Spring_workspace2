package com.application_bank.repository;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.application_bank.pojo.Manager;
@Repository
public interface ManagerRepository extends CrudRepository<Manager, Integer>   {
	
	
}
