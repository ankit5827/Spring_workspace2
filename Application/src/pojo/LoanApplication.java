package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loanapplication")
public class LoanApplication {
	@Id
	@Column(name="loanapplicationid")
	@GeneratedValue
	private int loanapplicationid;
	private float loanamount;
	private float duration;
	private float annualincome;
	private int customerid;
	private int loanid;
	public int getLoanapplicationid() {
		return loanapplicationid;
	}
	public float getLoanamount() {
		return loanamount;
	}
	public float getDuration() {
		return duration;
	}
	public float getAnnualincome() {
		return annualincome;
	}
	@ManyToOne
	@JoinColumn (name = "customer_id")
	public int getCustomerid() {
		return customerid;
	}
	@ManyToOne
	@JoinColumn (name = "loanid")
	
	public int getLoanid() {
		return loanid;
	}
	public void setLoanapplicationid(int loanapplicationid) {
		this.loanapplicationid = loanapplicationid;
	}
	public void setLoanamount(float loanamount) {
		this.loanamount = loanamount;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public void setAnnualincome(float annualincome) {
		this.annualincome = annualincome;
	}
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	
	

}
