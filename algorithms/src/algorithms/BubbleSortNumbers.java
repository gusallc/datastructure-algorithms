package algorithms;

import java.util.Arrays;
import java.util.List;

public class BubbleSortNumbers {

    static void bubble(List<Integer> arr) {
        int length = arr.size();
        for (int legthIterations = 0; legthIterations < length; legthIterations++) {
            for (int j = 1; j < (length - legthIterations); j++) {
                int previousPosition = arr.get(j - 1);
                int currentPosition = arr.get(j);
                if (previousPosition > currentPosition) {
                    arr.set(j - 1, currentPosition);
                    arr.set(j, previousPosition);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 60, 35, 2, 45, 320, 5);
        System.out.println("Array Before Bubble Sort");
        array.forEach(i -> System.out.print(i + " "));
        System.out.println();
        bubble(array);
        System.out.println("Array After Bubble Sort");
        array.forEach(i -> System.out.print(i + " "));
    }

}
