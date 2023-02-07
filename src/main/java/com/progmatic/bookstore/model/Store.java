package com.progmatic.bookstore.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeName;

    @OneToMany(mappedBy="store")
    private List<Stock> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Stock> getBooks() {
        return books;
    }

    public void setBooks(List<Stock> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Store{");
        sb.append("bookstoreId=").append(id);
        sb.append(", storeName='").append(storeName).append('\'');
        sb.append(", books=").append(books);
        sb.append('}');
        return sb.toString();
    }
}
