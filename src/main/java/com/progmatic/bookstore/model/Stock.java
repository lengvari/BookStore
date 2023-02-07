package com.progmatic.bookstore.model;

import jakarta.persistence.*;

@Entity
public class Stock {

    @EmbeddedId
    private StockId stockId;

    private int quantity;

    public StockId getStockId() {
        return stockId;
    }

    public void setStockId(StockId stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

