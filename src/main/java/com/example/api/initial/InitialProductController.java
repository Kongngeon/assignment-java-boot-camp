package com.example.api.initial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class InitialProductController {
    @Autowired
    private InitialProductService initialProductService;

    public void initialProductsData(){
        initialProductService.createProductItems();
        System.out.println("initial products data success");
    }

}
