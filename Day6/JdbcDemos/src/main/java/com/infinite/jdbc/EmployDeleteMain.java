package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
	public static void main( String[] args){
		int empno;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite","root","india@123");
		String cmd="Delete from employ where empno = ?";
		PreparedStatement pst=conn.prepareStatement(cmd);
		pst.setInt(1,empno);
		
		pst.executeUpdate();
		System.out.println("** record  found deleted");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
