package com.example.api;

import com.example.api.initial.InitialProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ApiApplication {
	@Autowired
	private InitialProductController initialProductController;

	@PostConstruct
	public void initial(){
		System.out.println("initial products data 5 items");
		initialProductController.initialProductsData();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
