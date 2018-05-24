package com.playstore;

abstract class Reading extends Content {
    private String publisher;
    private String genre;
    private int pageNumber;

    Reading(Content.Type type, String ID, String name, String publisher, String genre, int pageNumber) {
        super(type, ID, name);
        this.publisher = publisher;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }

    Reading(Content.Type type, String ID, String name, int price, String publisher, String genre, int pageNumber) {
        super(type, ID, name, price);
        this.publisher = publisher;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }

    String getGenre() {
        return genre;
    }

}
