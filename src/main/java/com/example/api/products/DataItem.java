package com.example.api.products;

public class DataItem{
	private String image;
	private int quantity;
	private double price;
	private int id;
	private String detail;
	private String title;
	private String shopName;

	public DataItem(String title) {
		this.title = title;
	}

	public String getImage(){
		return image;
	}

	public int getQuantity(){
		return quantity;
	}

	public double getPrice(){
		return price;
	}

	public int getId(){
		return id;
	}

	public String getDetail(){
		return detail;
	}

	public String getTitle(){
		return title;
	}

	public String getShopName(){
		return shopName;
	}
}
