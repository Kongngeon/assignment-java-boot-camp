package com.example.api.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
    @Id
    public int id;
    private String title;
    @Column(length = 1000)
    private String detail;
    private float price;
    private int quantity;
    private String shopName;

    public ProductEntity() {
    }

    public ProductEntity(int id, String title, String detail, float price, int quantity, String shopName) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.price = price;
        this.quantity = quantity;
        this.shopName = shopName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShopName() {
        return shopName;
    }

}
