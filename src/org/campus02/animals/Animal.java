package org.campus02.animals;

public abstract class Animal {
    private String colour;
    private int countEyes;
    private String name;
    public abstract void walk();

    public Animal(String colour, int countEyes, String name) {
        this.colour = colour;
        this.countEyes = countEyes;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
}
