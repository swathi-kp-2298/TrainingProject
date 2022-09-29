package com.infinite.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class StockInsert {
	public static void main(String[] args) {
		StockDAO dao=new StockDAO();
		Stock stock =new Stock();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter iteams");
		stock.setIteamName(sc.next());
		System.out.println("enter price");
		stock.setPrice(sc.nextDouble());
		System.out.println("enter Quantity available");
		stock.setQuantityAvail(sc.nextInt());
		try {
			System.out.println(dao.addStock(stock));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
