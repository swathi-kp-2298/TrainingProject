package com.infinite.insurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer {
	
	@Id
	@Column(name="CustomerId")
	private String customerId; 
	
	@Column(name="CustomerName")
	private String customerName ;
	
	@Column(name="CustomerDesignation")
	private String customerDesignation ;
	
	@Column(name="CustomerEmail")
	private String customerEmail;
	
	@Column(name="CustomerAddress")
	private String customerAddress;
	
	@Column(name="CustomerContact")
	private long customerContact ;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDesignation() {
		return customerDesignation;
	}

	public void setCustomerDesignation(String customerDesignation) {
		this.customerDesignation = customerDesignation;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	
	
}
