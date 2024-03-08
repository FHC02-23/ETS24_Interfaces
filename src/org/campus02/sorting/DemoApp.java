package org.campus02.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        Car[] arr = {new Car(1000, "small", 2000),
                new Car(2000, "medium", 2000)
        };

        ArrayHelper.arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
    }
}
