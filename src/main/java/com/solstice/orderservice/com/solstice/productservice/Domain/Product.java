package com.solstice.orderservice.com.solstice.productservice.Domain;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_description")
    private String productDesc;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "product_price")
    private double productPrice;

    public Product(){}
    public Product(long productId, String productName, String productDesc, String productImage, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productImage = productImage;
        this.productPrice = productPrice;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
