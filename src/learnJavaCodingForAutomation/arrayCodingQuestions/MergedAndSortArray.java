package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class MergedAndSortArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        int[] merge = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }
        System.out.println("Merged Array is: " + Arrays.toString(merge));
        int temp = 0;
        for (int i = 0; i < merge.length; i++) {
            for (int j = i + 1; j < merge.length; j++) {
                if (merge[i] > merge[j]) {
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(merge));
    }
}
