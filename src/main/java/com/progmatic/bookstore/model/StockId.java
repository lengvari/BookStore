package com.progmatic.bookstore.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StockId implements Serializable {

    private Long storeId;
    private Long bookId;

}
