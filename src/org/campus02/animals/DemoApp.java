package org.campus02.animals;

public class DemoApp {
    public static void main(String[] args) {

        Cat c = new Cat("brown", 2, "cati");
        c.makeNoise();

        Animal a = c; // upcast
        a.makeNoise();

        Cat c1 = (Cat) a;
        c1.makeNoise();

        //Dog g = (Dog) a;
        //g.makeNoise();


    }
}
