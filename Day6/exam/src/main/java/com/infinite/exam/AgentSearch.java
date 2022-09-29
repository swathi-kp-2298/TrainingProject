package com.infinite.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	public static void main( String[] args){
		int agentid;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no");
		agentid=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
		String cmd="select * from agent where agentid=?";
		PreparedStatement pst=conn.prepareStatement(cmd);
		pst.setInt(1,agentid);
		ResultSet rs =pst.executeQuery();
		if(rs.next()){
			System.out.println("AgentID"+ rs.getInt("agentid"));
			System.out.println("Name"+rs.getString("name"));
			System.out.println("City"+rs.getString("city"));
			System.out.println("Gender"+rs.getString("GENDER"));
			System.out.println("MaritalStatus"+rs.getString("MaritalStatus"));
			System.out.println("Premium"+rs.getString("Premium"));
		}else{
			System.out.println("** record not found");
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
