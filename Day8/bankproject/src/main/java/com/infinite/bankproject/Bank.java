package com.infinite.bankproject;

public class Bank {
 private int accountno;
 private String Fname;
 private String Lname;
 private String city;
 private String state;
 private int amount;
 private String cheqfacil;
 private String accountType;
public int getAccountno() {
	return accountno;
}
public void setAccountno(int accountno) {
	this.accountno = accountno;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getCheqfacil() {
	return cheqfacil;
}
public void setCheqfacil(String cheqfacil) {
	this.cheqfacil = cheqfacil;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Bank() {
	
	// TODO Auto-generated constructor stub
}
public Bank(int accountno, String fname, String lname, String city, String state, int amount, String cheqfacil,
		String accountType) {
	
	this.accountno = accountno;
	Fname = fname;
	Lname = lname;
	this.city = city;
	this.state = state;
	this.amount = amount;
	this.cheqfacil = cheqfacil;
	this.accountType = accountType;
}
@Override
public String toString() {
	return "Bank [accountno=" + accountno + ", Fname=" + Fname + ", Lname=" + Lname + ", city=" + city + ", state="
			+ state + ", amount=" + amount + ", cheqfacil=" + cheqfacil + ", accountType=" + accountType + "]";
}

 
 
}
