package com.example.api.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ProductsResponse getProductByTitle(@RequestParam String title){
        List<ProductEntity> products = productService.findByTitle(title);
        return new ProductsResponse(products,"Found products","OK");
    }

    @GetMapping("/products/all")
    public ProductsResponse getProductAll(){
        List<ProductEntity> products = productService.findAll();
        if(products.size() > 0){
            ProductsResponse productsResponse = new ProductsResponse(products,"Found products","OK");
            return productsResponse;
        }

        ProductsResponse productsResponse = new ProductsResponse(products,"Empty record","FAIL");
        return productsResponse;
    }

    @GetMapping("/product/{id}")
    public ProductInfoResponse getProductById(@PathVariable int id){
        Optional<ProductEntity> product = productService.findById(id);
        return new ProductInfoResponse(product.get(),"successful","OK");
    }

}
