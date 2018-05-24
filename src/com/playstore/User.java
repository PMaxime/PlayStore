package com.playstore;

import java.util.ArrayList;

public class User {
    private String ID;
    private String name;
    private String phoneNumber;
    private int balance;
    private OS os;
    private double discount;
    private ArrayList<Content> boughtContents;
    
    User(String ID, String name, String phoneNumber, OS os) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = 0;
        this.os = os;
        this.discount = 0;
        this.boughtContents = new ArrayList<>();
    }

    User(String ID, String name, String phoneNumber, int balance, OS os) {
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.os = os;
        this.discount = 0;
        this.boughtContents = new ArrayList<>();
    }

    String getID() {
        return ID;
    }

    String getName() {
        return name;
    }

    void buyContent(Content content) {
        String output; 
        boolean shouldContinue = true;
        if (content.getClass().getName().equals("com.playstore.Game"))
            shouldContinue = checkOS((Game) content);
        if (shouldContinue)
            shouldContinue = checkPrice(content);
        if (shouldContinue) {
            balance -= content.getPrice() * this.discount;
            if (content.getClass().getName().equals("com.playstore.Game"))
                output = String.format("%s bought %s for %s", name, content.getName(), ((Game)content).getOs().getType());
            else
                output = String.format("%s bought %s", name, content.getName());
            boughtContents.add(content);
            System.out.println(output);
        }

    }
    
    void becomePremium() {
        String output;
        if (balance < 100) {
            output = String.format("%s cannot become premium user due to insufficient fund!", name);
        }
        else {
            output = String.format("%s is now premium user!", name);
            balance -= 100;
            discount = 0.20;
        }
        System.out.println(output);
    }
    
    void showContentsBought() {
        StringBuilder output = new StringBuilder(String.format("The contents bought by %s - ", name));
        
        for (Content content : boughtContents) {
            if (content.getClass().getName().equals("com.playstore.Game")) {
                output.append(String.format("%s for %s", content.getName(), ((Game)content).getOs().getType()));
            }
            else {
                output.append(String.format("%s", content.getName()));
            }
        }
        System.out.println(output);
    }
    
    private boolean checkPrice(Content content) {
        String output;
        if (balance < content.getPrice() * discount) {
            output = String.format("%s cannot buy %s due to insuffiecient fund!", name, content.getName());
            System.out.println(output);
            return false; //TODO: Throw exception
        }
        return true;
    }

    private boolean checkOS(Game game) {
        String output;
        if (!game.getOs().getType().equals(os.getType())) {
            output = String.format("%s cannot buy %s for %s due to OS mismatch", name, game.getName(), game.getOs().getType());
            System.out.println(output);
            return false; //TODO: Throw exception
        }

        if (game.getOs().getVersion() > os.getVersion()) {
            output = String.format("%s cannot buy %s for %s due to OS mismatch", name, game.getName(), game.getOs().getType());
            System.out.println(output);
            return false; //TODO: Throw exception
        }

        return true;
    }

}
