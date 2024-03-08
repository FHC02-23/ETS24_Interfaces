package org.campus02.animals;

public class FlyingDog extends Dog implements Fly {
    public FlyingDog(String colour, int countEyes, String name) {
        super(colour, countEyes, name);
    }

    @Override
    public void fly() {
        System.out.println("Flying dog can fly");
    }
}
