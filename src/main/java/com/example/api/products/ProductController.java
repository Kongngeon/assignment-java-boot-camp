package com.example.api.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ProductsResponse getProductByTitle(@RequestParam String title){
        List<ProductEntity> products = productService.findByTitle(title);
        if(products.size() > 0){
            ProductsResponse productsResponse = new ProductsResponse(products,"Found products","OK");
            return productsResponse;
        }

            ProductsResponse productsResponse = new ProductsResponse(products,"record not found!","FAIL");
            return productsResponse;
    }

    @GetMapping("/products/all")
    public ProductsResponse getProductAll(){
        List<ProductEntity> products = productService.findAll();
        if(products.size() > 0){
            ProductsResponse productsResponse = new ProductsResponse(products,"Found products","OK");
            return productsResponse;
        }

        ProductsResponse productsResponse = new ProductsResponse(products,"record not found!","FAIL");
        return productsResponse;
    }

}
