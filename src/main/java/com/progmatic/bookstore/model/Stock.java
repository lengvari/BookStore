package com.progmatic.bookstore.model;

import jakarta.persistence.*;

@Entity
public class Stock {

    @EmbeddedId
    private StockId Id;

    private int quantity;

    @ManyToOne
    @MapsId("storeId")
    private Store store;

    @ManyToOne
    @MapsId("bookId")
    Book book;

    public StockId getId() {
        return Id;
    }

    public void setId(StockId id) {
        Id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

