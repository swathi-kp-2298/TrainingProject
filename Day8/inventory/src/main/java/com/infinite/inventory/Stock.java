package com.infinite.inventory;

public class Stock {
	private String stockdi;
	private String iteamName; 
	private Double price;
	private int quantityAvail;
	public String getStockdi() {
		return stockdi;
	}
	public void setStockdi(String stockdi) {
		this.stockdi = stockdi;
	}
	public String getIteamName() {
		return iteamName;
	}
	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public Stock(String stockdi, String iteamName, Double price, int quantityAvail) {
		
		this.stockdi = stockdi;
		this.iteamName = iteamName;
		this.price = price;
		this.quantityAvail = quantityAvail;
	}
	public Stock() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [stockdi=" + stockdi + ", iteamName=" + iteamName + ", price=" + price + ", quantityAvail="
				+ quantityAvail + "]";
	}
	

}
