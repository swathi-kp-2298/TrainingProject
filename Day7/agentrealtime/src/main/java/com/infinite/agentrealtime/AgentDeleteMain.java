package com.infinite.agentrealtime;

import java.sql.SQLException;
import java.util.Scanner;



public class AgentDeleteMain {
	public static void main(String[] args) {
		int agentid;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the agentid");
		 agentid=sc.nextInt();
		 AgentDAO dao= new AgentDAO();
		try {
			System.out.println(dao.deleteAgent(agentid));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
