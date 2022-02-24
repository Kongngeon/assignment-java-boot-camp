package com.example.api.products;

import java.util.List;

public class ProductsResponse{
	private List<DataItem> data;
	private String message;
	private String status;

	public ProductsResponse(List<DataItem> data, String message, String status) {
		this.data = data;
		this.message = message;
		this.status = status;
	}

	public List<DataItem> getData(){
		return data;
	}

	public String getMessage(){
		return message;
	}

	public String getStatus(){
		return status;
	}
}