package com.playstore;

public class Book extends Reading {
    private String[] authors;
    
    Book(String ID, String name, String publisher, String genre, int pageNumber, String[] authors) {
        super(ID, name, publisher, genre, pageNumber);
        this.authors = authors;
    }

    Book(String ID, String name, int price, String publisher, String genre, int pageNumber, String[] authors) {
        super(ID, name, price, publisher, genre, pageNumber);
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
