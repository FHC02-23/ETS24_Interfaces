package org.campus02.animals;

public class Frog extends Animal{
    public Frog(String colour, int countEyes, String name) {
        super(colour, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("frog jumps");
    }

    @Override
    public void makeNoise() {
        System.out.println("frog quacks");
    }
}
