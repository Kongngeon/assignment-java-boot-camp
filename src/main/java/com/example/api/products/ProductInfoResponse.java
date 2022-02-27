package com.example.api.products;

import java.util.Optional;

public class ProductInfoResponse {
    private ProductEntity data;
    private String message;
    private String status;

    public ProductInfoResponse(ProductEntity data, String message, String status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }


    public ProductEntity getData(){
        return data;
    }

    public String getMessage(){
        return message;
    }

    public String getStatus(){
        return status;
    }
}
