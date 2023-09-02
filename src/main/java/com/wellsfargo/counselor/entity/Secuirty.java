package com.wellsfargo.counselor.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Secuirty {
     @Id
    @GeneratedValue()
    private long SecurityId;

    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public void Security(String name, String category, int purchasePrice, int purchaseDate, int quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return SecurityId;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int PurchaseDate() {
        return purchaseDate;
    }

    public void PurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int Quantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
}
