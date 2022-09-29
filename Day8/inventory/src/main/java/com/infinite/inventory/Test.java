package com.infinite.inventory;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(new StockDAO().generateStockid());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
