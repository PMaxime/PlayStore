package com.playstore;

public class Magazine extends Reading {
    private String mainFeatureTitle;
    
    Magazine(String ID, String name, String publisher, String genre, int pageNumber, String mainFeatureTitle) {
        super(ID, name, publisher, genre, pageNumber);
        this.mainFeatureTitle = mainFeatureTitle;
    }

    Magazine(String ID, String name, int price, String publisher, String genre, int pageNumber, String mainFeatureTitle) {
        super(ID, name, price, publisher, genre, pageNumber);
        this.mainFeatureTitle = mainFeatureTitle;
    }

    public String getMainFeatureTitle() {
        return mainFeatureTitle;
    }

    public void setMainFeatureTitle(String mainFeatureTitle) {
        this.mainFeatureTitle = mainFeatureTitle;
    }
}
