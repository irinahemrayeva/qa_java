package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Male".equals(sex)) {
            hasMane = true;
        } else if ("Female".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Unknown");

        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Predator");
    }
}
