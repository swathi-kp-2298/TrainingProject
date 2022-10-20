package com.infinite.LibraryHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LibUsers")
public class LibUsers {
	@Id
	@Column(name="username")
private String userName;
	@Column(name="password")
private String passWord;
	
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public LibUsers(String userName, String passWord) {
	super();
	this.userName = userName;
	this.passWord = passWord;
}
public LibUsers() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LibUsers [userName=" + userName + ", passWord=" + passWord + "]";
}

}
