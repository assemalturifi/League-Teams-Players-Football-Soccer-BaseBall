package com.company;

public abstract class Player {
    private String name;

    public Player(String name) {// we are creating the constractor, so we can actually create the object
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
