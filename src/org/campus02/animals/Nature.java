package org.campus02.animals;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animals;

    public Nature() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public int countColor(String colour) {
        int counter = 0;
        for (Animal a : animals)
            if (a.getColour().equals(colour))
                counter++;

        return counter;
    }
 }
