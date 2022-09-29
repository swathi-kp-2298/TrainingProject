package com.infinite.bankproject;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo;
		double depositeAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno");
		accountNo=sc.nextInt();
		System.out.println("entern deposite amount");
		depositeAmount=sc.nextDouble();
		BankDAO dao= new BankDAO();
		try {
			System.out.println(dao.depositAmmount(accountNo, depositeAmount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
