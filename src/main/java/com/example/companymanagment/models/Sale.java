package com.example.companymanagment.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="sale")
public class Sale {
    private String productName;
    @Id
    private Long productId;
    private double productPrice;

//    public Sale(String productName, String productId, double productPrice) {
//        this.productName = productName;
//        this.productId = productId;
//        this.productPrice = productPrice;
//    }
    @ManyToOne
    @JoinColumn(name="seller")
    @JsonIgnore //If we use this annotation, news will be ignored and will not be showed
    private Seller seller;

    public Sale() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getProduktPrice() {
        return productPrice;
    }

    public void setProduktPrice(double produktPrice) {
        this.productPrice = produktPrice;
    }
}
