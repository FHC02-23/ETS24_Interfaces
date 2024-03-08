package org.campus02.animals;

public class Dog extends Animal{
    public Dog(String colour, int countEyes, String name) {
        super(colour, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("dog walks");
    }

    @Override
    public void makeNoise() {
        System.out.println("dogs barks");
    }
}
