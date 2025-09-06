package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {10,40,20,30};
        int i = 0;
        int j = a.length - 1;
        int temp = 0;

        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse Array is: " + Arrays.toString(a));
    }
}
