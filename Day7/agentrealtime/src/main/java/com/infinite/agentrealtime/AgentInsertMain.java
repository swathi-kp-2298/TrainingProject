package com.infinite.agentrealtime;

import java.sql.SQLException;
import java.util.Scanner;


public class AgentInsertMain {
public static void main(String[] args) {
	Agent agent=new Agent();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter agent name");
	agent.setName(sc.next());
	System.out.println("enter city");
	agent.setCity(sc.next());
	System.out.println("enter Gender");
	agent.setGender(sc.next());
	System.out.println("enter Maritalstatus");
	agent.setMaritalstatus(sc.nextInt());
	System.out.println("enter premium");
	agent.setPremium(sc.nextInt());
	AgentDAO dao=new AgentDAO();
	try {
		System.out.println(dao.addAgent(agent));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
