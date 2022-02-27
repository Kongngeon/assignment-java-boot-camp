package com.example.api.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> findByTitle(String title){
        List<ProductEntity>  result = productRepository.findByTitleContaining(title);
        return result;
    }

    public List<ProductEntity> findAll(){
        List<ProductEntity>  result = productRepository.findAll();
        return result;
    }


}