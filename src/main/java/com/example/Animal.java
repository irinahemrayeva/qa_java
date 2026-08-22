package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Herbivore".equals(animalKind)) {
            return List.of("Grass", "Plants");
        } else if ("Predator".equals(animalKind)) {
            return List.of("Animals", "Birds", "Fishes");
        } else {
            throw new Exception("Unknown type, use Predator or Herbivore");
        }
    }

    public String getFamily() {
        return "There are several families: hares, squirrels, mice, cats, dogs, bears, mustelids.";
    }
}