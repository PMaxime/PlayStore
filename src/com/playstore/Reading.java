package com.playstore;

public abstract class Reading extends Content {
    private String publisher;
    private String genre;
    private int pageNumber;

    Reading(String ID, String name, String publisher, String genre, int pageNumber) {
        super(ID, name);
        this.publisher = publisher;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }

    Reading(String ID, String name, int price, String publisher, String genre, int pageNumber) {
        super(ID, name, price);
        this.publisher = publisher;
        this.genre = genre;
        this.pageNumber = pageNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
