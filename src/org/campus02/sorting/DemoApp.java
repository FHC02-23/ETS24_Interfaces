package org.campus02.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        ArrayHelper.arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));
    }
}
