package com.example.api.products;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    @DisplayName("[Case Success] Product Title 'Product Testing' found!")
    void findByTitleContaining() {
        ProductEntity item_test = new ProductEntity(99,
                "DANVOUY Womens T Shirt Casual Cotton Short",
                "95%Cotton,5%Spandex, Features: Casual, Short Sleeve, Letter Print,V-Neck,Fashion Tees, The fabric is soft and has some stretch., Occasion: Casual/Office/Beach/School/Home/Street. Season: Spring,Summer,Autumn,Winter.",
                990.0f,100,"Women's clothing");
        productRepository.save(item_test);

        //Act
        List<ProductEntity> result =  productRepository.findByTitleContaining("Womens");
        //Assert
        assertTrue((result.size()==1 && result.get(0).id == 99));
    }
}