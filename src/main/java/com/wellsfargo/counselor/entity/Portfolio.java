package com.wellsfargo.counselor.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long PortfolioId;

    @Id
    @GeneratedValue()
    private long ClientId;

    @Column(nullable = false)
    private int creationdate;

    protected Portfolio() {

    }

    public Portfolio(int creationdate) {
        this.creationdate = creationdate;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public int getCreationDate() {
        return creationdate;
    }

    public void setCreationDate(int creationdate) {
        this.creationdate = creationdate;
    }
}
