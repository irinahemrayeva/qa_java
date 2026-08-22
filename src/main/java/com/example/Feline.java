package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {
    //Вношу изменения, а то не коммитится
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Predator");
    }

    @Override
    public String getFamily() {
        return "Felidae";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
