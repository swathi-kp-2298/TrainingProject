package com.infinite.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AgentDAO {

	SessionFactory sessionFactory;
	Session session;
	
	public List<Agent> searchAgent(){
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;
		
	}
	
	public List<Agent> showAgent() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;
	}
}
