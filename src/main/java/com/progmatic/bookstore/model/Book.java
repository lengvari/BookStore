package com.progmatic.bookstore.model;

import com.progmatic.bookstore.App;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String isbn;

    private String author;

    private String title;

    @OneToMany
    @JoinTable(
            name= "Stock",
            joinColumns = @JoinColumn(name= "BookId"),
            inverseJoinColumns = @JoinColumn(name= "StoreId")
    )

    private List<Store> inStockAt;

    private boolean onLine;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Store> getInStockAt() {
        return inStockAt;
    }

    public void setInStockAt(List<Store> inStockAt) {
        this.inStockAt = inStockAt;
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
        sb.append("bookId=").append(bookId);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", inStockAt=").append(inStockAt);
        sb.append(", onLine=").append(onLine);
        sb.append('}');
        return sb.toString();
    }
}
