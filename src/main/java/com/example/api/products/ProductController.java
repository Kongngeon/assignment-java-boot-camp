package com.example.api.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ProductsResponse getProductByName(@RequestParam String title){
        List<DataItem> products = new ArrayList<DataItem>();
        DataItem dataItem = new DataItem(title);
        products.add(dataItem);
        ProductsResponse productsResponse = new ProductsResponse(products,"success","OK");
        return productsResponse;
    }
}
