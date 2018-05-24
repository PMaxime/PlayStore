package com.playstore;

public class OS {
    private String type;
    private int version;
    
    OS(String type, int version) {
        this.type = type;
        this.version = version;
    }

    String getType() {
        return type;
    }

    int getVersion() {
        return version;
    }

}
