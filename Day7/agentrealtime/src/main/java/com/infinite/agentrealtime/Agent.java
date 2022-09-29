package com.infinite.agentrealtime;

public class Agent {
	private  int Agentid;
	private  String Name;
	private String City;
	private String Gender;
	private int MaritalStatus;
	private int premium;
	
	public Agent(int agentid, String name, String city, String gender, int maritalstatus, int premium) {
		
		Agentid = agentid;
		Name = name;
		City = city;
		Gender = gender;
		MaritalStatus = maritalstatus;
		this.premium = premium;
	}
	
	public Agent() {
		
		// TODO Auto-generated constructor stub
	}

	public int getAgentid() {
		return Agentid;
	}
	public void setAgentid(int agentid) {
		Agentid = agentid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalstatus() {
		return MaritalStatus;
	}
	public void setMaritalstatus(int maritalstatus) {
		MaritalStatus = maritalstatus;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "Agent [Agentid=" + Agentid + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", Maritalstatus=" + MaritalStatus + ", premium=" + premium + "]";
	}

	
	

}
