package com.infinite.agentrealtime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AgentDAO {
	Connection connection;
	PreparedStatement pst;

	
	public List<Agent> showAgent() throws ClassNotFoundException, SQLException {
		List<Agent> agentList =new ArrayList<Agent>();
		connection= ConnectionHelper.getConnection();
		String cmd="select * from Agent";
		pst=connection.prepareStatement(cmd);
		ResultSet rs =pst.executeQuery();
		Agent agent=null; 
		while(rs.next()){
			agent= new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(rs.getString("gender"));
			agent.setMaritalstatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getInt("premium"));
			agentList.add(agent);
		}
		return agentList;
	}
	
	public Agent searchAgent(int agentid) throws ClassNotFoundException, SQLException{
		connection= ConnectionHelper.getConnection();
		String cmd="select * from Agent where agentid= ? ";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, agentid);
		ResultSet rs =pst.executeQuery();
		Agent agent=null; 
		if(rs.next()){
			agent= new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(rs.getString("gender"));
			agent.setMaritalstatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getInt("premium"));
		
		}
		return agent;
		
	}
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException{
		 connection =ConnectionHelper.getConnection();
		 String cmd="insert into Agent(name,city,gender,maritalStatus,premium)" + "values(?,?,?,?,?)";
		 pst=connection.prepareStatement(cmd);
		 pst.setString(1, agent.getName());
		 pst.setString(2, agent.getCity());
		 pst.setString(3, agent.getGender());
		 pst.setInt(4, agent.getMaritalstatus());
		 pst.setInt(5, agent.getPremium());
		 pst.executeUpdate();
		 return "record inserted..";
		  
	 }
	 public String deleteAgent(int agentid) throws ClassNotFoundException, SQLException{
		 Agent agent =searchAgent(agentid);
		 if(agent!=null){
			 connection =ConnectionHelper.getConnection();
			 String cmd="delete from Agent where agentid=?";
			 pst=connection.prepareStatement(cmd);
			 pst.setInt(1,agentid);
			 pst.executeUpdate();
			 return "record Deleted..";
		 }
		 return "Employ Record Not found";
		 }
	 public String updateAgent(Agent agentnew) throws ClassNotFoundException, SQLException{
		 Agent agent=searchAgent(agentnew.getAgentid());
		 if (agent!=null){
			 String cmd="update Agent set name=?, city=?, gender=?," + "maritalstatus=?,premium=? where agentid=?";
			 pst=connection.prepareStatement(cmd);
			 pst.setString(1, agentnew.getName());
			 pst.setString(2, agentnew.getCity());
			 pst.setString(3, agentnew.getGender());
			 pst.setInt(4, agentnew.getMaritalstatus());
			 pst.setInt(5, agentnew.getPremium());
			 pst.setInt(6,agentnew.getAgentid());
			 pst.executeUpdate();
			 return "record inserted..";
		 }
		 return "record not found";
	 }

}
