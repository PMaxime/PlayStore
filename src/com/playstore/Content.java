package com.playstore;

public abstract class Content {
    private String ID;
    private String name;
    private int downloads;
    private int price;
    private Type type;

    // Override of the toString method
    // Ternary to check the type and display the right output
    @Override
    public String toString() {
        return getType().name() + " " + getName() +
                (getType() == Content.Type.Game ? " for " + ((Game)this).getOs().getType() : "");
    }

    protected enum Type { Game, Magazine, Book }

    Content(Type type, String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.downloads = 0;
        this.price = 0;
        this.type = type;
    }

    Content(Type type, String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.downloads = 0;
        this.price = price;
        this.type = type;
    }

    Type getType() { return type; }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

}
