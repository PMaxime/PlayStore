package com.playstore;

public abstract class Content {
    private String ID;
    private String name;
    private int downloads;
    private int price;
    private Comment[] reviews;

    Content(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.downloads = 0;
        this.price = 0;
        this.reviews = null;
    }

    Content(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.downloads = 0;
        this.price = price;
        this.reviews = null;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Comment[] getReviews() {
        return reviews;
    }

    public void setReviews(Comment[] reviews) {
        this.reviews = reviews;
    }
}
