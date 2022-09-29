package com.infinite.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class StockSearchMain {
public static void main(String[] args) {
	String stockId;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter stock id");
	stockId=sc.next();
	StockDAO dao=new StockDAO();
	try {
		Stock stock=dao.findStock(stockId);
		System.out.println(stock);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
