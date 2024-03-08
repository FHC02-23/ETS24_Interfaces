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

    public static <T> void arrangeOrder(Sortable<T>[] cars) {
        boolean swapped = true;
        int count = 0;
        while (swapped) {
            swapped = false;
            count++;
            for (int i = 0; i < cars.length - count; i++) {
                if (cars[i].compare((T)cars[i + 1]) > 0) {
                    Sortable<T> swap = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = swap;
                    swapped = true;
                }
            }
        }
    }
}
