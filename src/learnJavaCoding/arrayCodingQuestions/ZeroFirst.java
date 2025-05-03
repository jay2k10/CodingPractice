package learnJavaCoding.arrayCodingQuestions;

import java.util.Arrays;

public class ZeroFirst {
    public static void main(String[] args) {
        int[] a = {1, 3, 0, 4, 0, 6, 7, 0};
        int n = a.length;
        int nonZero = n - 1;
        System.out.println("Original array is: " + Arrays.toString(a));

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[nonZero] = a[i];
                nonZero--;
            }

        }
        while (nonZero >= 0) {
            a[nonZero] = 0;
            nonZero--;
        }
        System.out.println("Sorted Array is: " + Arrays.toString(a));
    }
}
