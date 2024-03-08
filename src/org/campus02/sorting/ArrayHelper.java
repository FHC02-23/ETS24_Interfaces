package org.campus02.sorting;

public class ArrayHelper {

    public static void arrangeOrder(int[] numbers) {

        boolean swapped = true;
        int count = 0;
        while (swapped) {
            swapped = false;
            count++;
            for (int i = 0; i < numbers.length - count; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int swap = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = swap;
                    swapped = true;
                }
            }
        }
    }
}
