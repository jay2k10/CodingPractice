package learnJavaCoding.stringCodingQuestions;

import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] a = {"pranavi", "jay", "tejaswini", "naman"};
        String temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted String Array is: " + Arrays.toString(a));
    }
}
