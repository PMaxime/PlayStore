package com.playstore;

public class Game extends Content {
    private boolean isMultiPlayer;
    private OS os;

    public Game(String ID, String name, boolean isMultiPlayer, OS os) {
        super(ID, name);
        this.os = os;
        this.isMultiPlayer = isMultiPlayer;
    }

    public Game(String ID, String name, int price, boolean isMultiPlayer, OS os) {
        super(ID, name, price);
        this.os = os;
        this.isMultiPlayer = isMultiPlayer;
    }

    public boolean isMultiPlayer() {
        return isMultiPlayer;
    }

    public void setMultiPlayer(boolean multiPlayer) {
        isMultiPlayer = multiPlayer;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }
}
