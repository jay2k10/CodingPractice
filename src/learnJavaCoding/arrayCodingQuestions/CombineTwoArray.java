package learnJavaCoding.arrayCodingQuestions;

import java.util.Arrays;

public class CombineTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] combine = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            combine[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            combine[a.length + i] = b[i];
        }
        System.out.println("Combined Array is: " + Arrays.toString(combine));
    }
}
