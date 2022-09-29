package com.infinite.inventory;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ShowAllStock {
	public static void main(String[] args) {
		StockDAO dao= new StockDAO();
		//Stock stock =new Stock();
		
		List<Stock> stocklist = null ;
	
			try {
				stocklist = dao.showAgent();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Stock stocks : stocklist){
				System.out.println(stocks);
		
	}
	}
	}
