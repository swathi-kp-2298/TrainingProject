package com.infinite.jdbcrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
public static void main(String[] args) {
	int empno;
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("enter the emp no");
	 empno=sc.nextInt();
	 EmployDAO dao= new EmployDAO();
	try {
		System.out.println(dao.deleteEmploy(empno));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
