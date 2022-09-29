package com.infinite.bankproject;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
public static void main(String[] args) {
	BankDAO dao=new BankDAO();
	Bank bank=new Bank();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter Fname");
	bank.setFname(sc.next());
	System.out.println("enter lname");
	bank.setLname(sc.next());
	System.out.println("enter city");
	bank.setCity(sc.next());
	System.out.println("enter state");
	bank.setState(sc.next());
	System.out.println("enter Amount");
	bank.setAmount(sc.nextInt());
	System.out.println("enter Cheqfacil(yes/no)");
	bank.setCheqfacil(sc.next());
	System.out.println("enter AccountType");
	bank.setAccountType(sc.next());

	try {
		//System.out.println(dao.generateAccountno());
		System.out.println(dao.createAccount(bank));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
