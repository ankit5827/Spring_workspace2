package com.application_bank.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="bank")
public class Bank {
	@Id
	private Integer bankid;
	@OneToMany(mappedBy="bank")
	private Set<Branch> branch;
	
	private String bankname;

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public Set<Branch> getBranch() {
		return branch;
	}

	public void setBranch(Set<Branch> branch) {
		this.branch = branch;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
	
	

}
