package com.infinite.agentrealtime;

import java.sql.SQLException;
import java.util.List;


public class AgentShowMain {
public static void main(String[] args) {
	AgentDAO dao= new AgentDAO();
	List<Agent> agentList;
	try {
		agentList = dao.showAgent();
		for(Agent employ : agentList){
			System.out.println(employ);
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
