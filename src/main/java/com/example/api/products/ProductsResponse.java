package com.example.api.products;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

public class ProductsResponse{
	private List<ProductEntity> data;
	private String message;
	private String status;

	public ProductsResponse(List<ProductEntity> data, String message, String status) {
		this.data = data;
		this.message = message;
		this.status = status;
	}


	public List<ProductEntity> getData(){
		return data;
	}

	public String getMessage(){
		return message;
	}

	public String getStatus(){
		return status;
	}

}