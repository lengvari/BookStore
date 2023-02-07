package com.progmatic.bookstore.model;

import com.progmatic.bookstore.App;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    private String title;

    @OneToMany(mappedBy = "book")
    private List<Stock> stores;

    private boolean onLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Stock> getStores() {
        return stores;
    }

    public void setStores(List<Stock> stores) {
        this.stores = stores;
    }

    public boolean isOnLine() {
        return onLine;
    }

    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("bookId=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", onLine=").append(onLine);
        sb.append('}');
        return sb.toString();
    }
}
