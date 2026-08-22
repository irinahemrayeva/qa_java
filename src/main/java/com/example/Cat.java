package com.example;

import java.util.List;

public class Cat {
    //Вношу изменения, а то не коммитится
    Predator predator;

    public Cat(Predator predator) {
        this.predator = predator;
    }

    public String getSound() {
        return "Mau";  // ← напечатай вручную!
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}