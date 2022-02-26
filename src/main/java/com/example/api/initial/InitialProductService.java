package com.example.api.initial;

import com.example.api.products.ProductEntity;
import com.example.api.products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitialProductService {
    @Autowired
    private ProductRepository productRepository;

    void createProductItems(){
        ProductEntity item_1 = new ProductEntity(1,
                "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
                "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
                2500.75f,3000,"Men's clothing");

        ProductEntity item_2 = new ProductEntity(2,
                "Mens Casual Premium Slim Fit T-Shirts",
                "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.",
                1500.0f,100,"Men's clothing");
        ProductEntity item_3 = new ProductEntity(3,
                "Mens Cotton Jacket",
                "great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day.",
                4500.25f,1000,"Men's clothing");
        ProductEntity item_4 = new ProductEntity(4,
                "Mens Casual Slim Fit",
                "The color could be slightly different between on the screen and in practice. / Please note that body builds vary by person, therefore, detailed size information should be reviewed below on the product description.",
                6000.0f,50,"Men's clothing");
        ProductEntity item_5 = new ProductEntity(5,
                "John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet",
                "From our Legends Collection, the Naga was inspired by the mythical water dragon that protects the ocean's pearl. Wear facing inward to be bestowed with love and abundance, or outward for protection.",
                695.0f,400,"Women's clothing");

        productRepository.save(item_1);
        productRepository.save(item_2);
        productRepository.save(item_3);
        productRepository.save(item_4);
        productRepository.save(item_5);
    }
}
