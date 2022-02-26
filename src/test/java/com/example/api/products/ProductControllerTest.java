package com.example.api.products;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Test
    @DisplayName("[Case Success] Product Title 'Women's Legends Naga' found!")
    void testGetProductByTitle(){
       ProductsResponse result =  testRestTemplate.getForObject("/products?title={title}",ProductsResponse.class,"Women's Legends Naga");
       assertEquals("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet",result.getData().get(0).getTitle());

    }

}