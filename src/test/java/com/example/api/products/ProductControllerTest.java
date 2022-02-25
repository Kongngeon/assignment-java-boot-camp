package com.example.api.products;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("[Success case] get products by title")
    void getProductByTitle() {
        //arrange
        List<DataItem> products = new ArrayList<DataItem>();
        DataItem dataItem = new DataItem("product test");
        products.add(dataItem);
//        ProductsResponse productsResponse = new ProductsResponse(products,"success","OK");
//        ProductsResponse result = testRestTemplate.getForObject("/products",ProductsResponse.class);

    }
}