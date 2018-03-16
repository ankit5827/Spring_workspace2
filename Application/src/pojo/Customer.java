package pojo;
import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="customer_id")
	@GeneratedValue
	private int customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String address;
	private long mobileno;
	private String date;
	private String gender;
	private Set <LoanApplication> loanapplicationid;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	@Column(unique=true)
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public String getDate() {
		return date;
	}
	public String getGender() {
		return gender;
	}
	@OneToMany(mappedBy="LoanApplication",cascade=CascadeType.ALL)
	public Set <LoanApplication> getLoanapplicationid() {
		return loanapplicationid;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLoanapplicationid(Set<LoanApplication> loanapplicationid) {
		this.loanapplicationid = loanapplicationid;
	}
	
	
	
	
	

}
