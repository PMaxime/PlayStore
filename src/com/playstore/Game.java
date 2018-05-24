package com.playstore;

import java.util.ArrayList;

public class Game extends Content {
    private boolean isMultiPlayer;
    private OS os;
    private ArrayList<Comment> reviews;

    public Game(String ID, String name, boolean isMultiPlayer, OS os) {
        super(Type.Game, ID, name);
        this.os = os;
        this.isMultiPlayer = isMultiPlayer;
        reviews = new ArrayList<>();
    }

    public Game(String ID, String name, int price, boolean isMultiPlayer, OS os) {
        super(Type.Game, ID, name, price);
        this.os = os;
        this.isMultiPlayer = isMultiPlayer;
        reviews = new ArrayList<>();
    }

    OS getOs() {
        return os;
    }

    private ArrayList<Comment> getReviews() {
        return reviews;
    }

    void addReviews(Comment review) {
        // John Doe added review "This is a fantastic game!" on Game Pokemon for Android
        System.out.println(review.getUser().getName() + " added review \""
                + review.getContent() + "\" on Game " + getName() + " for " + getOs().getType());
        reviews.add(review);
    }

    void printAllReview() {
        // The reviews of Game Pokemon for Android -
        System.out.println("\nThe reviews of Game " + getName() + " for " + getOs().getType() + " -");
        printAllReview(getReviews(), "");
    }

    // This method will display all comments and replies for the give arraylist
    // The prepend string is used for formatting output
    private void printAllReview(ArrayList<Comment> reviews, String prepend) {
//        John Doe (u1): This is a fantastic game!
//          Jane Joe (u2): I never liked this game!
//              John Doe (u1): Really??
//        David Roe (u3): The game crashes frequently.
        for (Comment review: reviews) {
            System.out.println(prepend + review.getUser().getName() + " (" + review.getUser().getID() + ") : \"" + review.getContent());
            // Recursively call the method to display all sub replies
            printAllReview(review.getReplies(), prepend + "\t");
        }
    }
}
