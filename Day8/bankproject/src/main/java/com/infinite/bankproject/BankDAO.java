package com.infinite.bankproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountno() throws ClassNotFoundException, SQLException{
		connection=ConnectionHelper.getConnection();
		 String cmd="select case when max(accountNo) is NULL then 1 else max(accountNo)+1 end accno from Bank";
		 pst=connection.prepareStatement(cmd);
		 ResultSet rs=pst.executeQuery();
		 rs.next();
		 int accno=rs.getInt("accno");
		 return accno;
	}
	
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException{
		int accountNo=generateAccountno();
		bank.setAccountno(accountNo);
		String cmd="insert into Bank(AccountNo,FirstName,LastName,city,state,Amount,cheqfacil,Accounttype) values(?,?,?,?,?,?,?,?)";
		connection= ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setString(2, bank.getFname());
		pst.setString(3, bank.getLname());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setInt(6, bank.getAmount());
		pst.setString(7, bank.getCheqfacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account created....";
		
	}
	
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException{
	connection =ConnectionHelper.getConnection();
	String cmd="select * from Bank where Accountno=?";
	pst =connection.prepareStatement(cmd);
	pst.setInt(1, accountNo);
	ResultSet rs=pst.executeQuery();
	Bank bank=null;
	if(rs.next()){
		bank=new Bank();
		bank.setAccountno(rs.getInt("accountno"));
		bank.setFname(rs.getString("Firstname"));
		bank.setLname(rs.getString("Lastname"));
		bank.setCity(rs.getString("City"));
		bank.setState(rs.getString("State"));
		bank.setAmount(rs.getInt("amount"));
		bank.setCheqfacil(rs.getString("cheqfacil"));
		bank.setAccountType(rs.getString("AccountType"));
	}
	return bank;
	
	}
	public  String closeAccount(int accountNo) throws ClassNotFoundException, SQLException{
		Bank bank=searchAccount(accountNo);
		if (bank!=null){
			String cmd="update bank set status='inactive' where accountNo=?";
			connection=ConnectionHelper.getConnection();
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,accountNo);
			pst.executeUpdate();
			return "Account  closed";
		}
		return "Account not closed";
	}
	
	
	public String depositAmmount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException{
		Bank bank=searchAccount(accountNo);
		if(bank!=null){
			connection=ConnectionHelper.getConnection();
			String cmd="update Bank set Amount=Amount+? where Accountno=?";
			pst=connection.prepareStatement(cmd);
			pst.setDouble(2, depositAmount);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			cmd="insert into Trans(AccountNo,TransAmount,TransType) value(?,?,?)";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setDouble(2, depositAmount);
			pst.setString(3, "c");
			pst.executeUpdate();
			return "Amount credited";
		}
		return "Account not found..";
	}
	public String withdrawAmount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException{
		Bank bank=searchAccount(accountNo);
		if(bank!=null){
			double balance=bank.getAmount();
			if(balance-withdrawAmount>=1000){
				connection=ConnectionHelper.getConnection();
				String cmd="update Bank set Amount=Amount-? where Accountno=?";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				
				pst.executeUpdate();
				cmd="insert into Trans(AccountNo,TransAmount,TransType) value(?,?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount debited";
			}
			else{
				return "insufficient funds..";
			}
			
		}
		return "Account not found..";
	}
	
}

