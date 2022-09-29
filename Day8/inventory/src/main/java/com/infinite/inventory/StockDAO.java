package com.infinite.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StockDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String generateStockid() throws ClassNotFoundException, SQLException{
		connection=ConnectionHelper.getConnection();
	//	String cmd="select 's' + RIGHT( '00' + CAST(ID AS VARCHAR)) FROM stock";
		String cmd = "select max(stockid) sid from Stock";
		pst=connection.prepareStatement(cmd);
		 ResultSet rs=pst.executeQuery();
		 rs.next();
		 String stkid=rs.getString("sid");
		 int id = Integer.parseInt(stkid.substring(1));
		 id++;
		 String stockId = String.format("S%03d", id);
		 return stockId;
	}
	

	public List<Stock> showAgent() throws ClassNotFoundException, SQLException {
		List<Stock> stocklist =new ArrayList<Stock>();
		connection= ConnectionHelper.getConnection();
		String cmd="select * from Stock";
		pst=connection.prepareStatement(cmd);
		ResultSet rs =pst.executeQuery();
		Stock stock=null; 
		while(rs.next()){
			stock= new Stock();
			stock.setStockdi(rs.getString("stockid"));
			stock.setIteamName(rs.getString("itemname"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setQuantityAvail(rs.getInt("Quantityavail"));
			stocklist.add(stock);
		}
		return stocklist;
	}
	
	public Stock findStock(String stockId) throws ClassNotFoundException, SQLException{
		connection =ConnectionHelper.getConnection();
		String cmd="select * from Stock where stockid=?";
		pst =connection.prepareStatement(cmd);
		pst.setString(1, stockId);
		ResultSet rs=pst.executeQuery();
		Stock stock=null;
		if(rs.next()){
			stock=new Stock();
			stock.setStockdi(rs.getString("stockid"));
			stock.setIteamName(rs.getString("itemname"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setQuantityAvail(rs.getInt("Quantityavail"));
		}
		return stock;
	}
	public String addStock(Stock stock) throws ClassNotFoundException, SQLException{
		String stockid=generateStockid();
		stock.setStockdi(stockid);
		String cmd="insert into stock(stockid,itemname,price,quantityavail) values(?,?,?,?)";
		connection= ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, stockid);
		pst.setString(2, stock.getIteamName());
		pst.setDouble(3, stock.getPrice());
		pst.setInt(4, stock.getQuantityAvail());
		
		pst.executeUpdate();
		return "stock inserted....";
		
	}
	}
