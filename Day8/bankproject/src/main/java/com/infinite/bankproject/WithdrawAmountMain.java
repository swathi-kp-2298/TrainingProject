package com.infinite.bankproject;

import java.sql.SQLException;
import java.util.Scanner;

public class WithdrawAmountMain {
public static void main(String[] args) {
	int accountNo;
	double withdrawAmount;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter accountno");
	accountNo=sc.nextInt();
	System.out.println("enter withdraw amount");
	withdrawAmount=sc.nextDouble();
	BankDAO dao= new BankDAO();
	try {
		System.out.println(dao.withdrawAmount(accountNo, withdrawAmount));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

