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
        if(result.size() != 0){
            return result;
        }
        throw new ProductNotFoundException("Product Title '"+title+"' not found!");
    }

    public List<ProductEntity> findAll(){
        List<ProductEntity>  result = productRepository.findAll();
        return result;
    }

    public Optional<ProductEntity> findById(int id) throws ProductNotFoundException {
        Optional<ProductEntity> result = productRepository.findById(id);
        if(result.isPresent()){
            return result;
        }
        throw new ProductNotFoundException("Not found product id "+Integer.toString(id));
    }




}