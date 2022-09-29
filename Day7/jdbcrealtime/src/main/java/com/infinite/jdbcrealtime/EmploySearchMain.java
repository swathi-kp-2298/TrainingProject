package com.infinite.jdbcrealtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {
	public static void main(String[] args){
		 int empno;
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the emp no");
		 empno=sc.nextInt();
		 EmployDAO dao= new EmployDAO();
		 try {
			Employ employ= dao.searchEmploy(empno);
			if (employ!=null){
				System.out.println(employ);
			}else{
				System.out.println("*** Record Not Found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
