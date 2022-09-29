package com.infinite.jdbcrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {
public static void main(String[] args) {

	 Employ employ=new Employ();
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println("enter the emp no");
	 employ.setEmpno(sc.nextInt());
	
		System.out.println("enter employ name");
		employ.setName(sc.next());
		System.out.println("enter dept");
		employ.setDept(sc.next());
		System.out.println("enter designation");
		employ.setDesig(sc.next());
		System.out.println("enter basic");
		employ.setBasic(sc.nextInt());
	 try {
		System.out.println(new EmployDAO().updateEmploy(employ));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
