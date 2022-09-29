package com.infinite.bankproject;

import java.sql.SQLException;
import java.util.Scanner;

public class CloseAccountMain{
	public static void main(String[] args) {
		int accountNo;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("entern Fname no");
		accountNo=sc.nextInt();
		BankDAO dao=new BankDAO();
		try {
			String bank=dao.closeAccount(accountNo);
				System.out.println(bank);	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
