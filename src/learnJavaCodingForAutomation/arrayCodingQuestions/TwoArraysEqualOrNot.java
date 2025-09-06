package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 2};
        int[] b = {1, 2, 3, 5};
        boolean flag = true;

        if (a.length != b.length) {
            System.out.println("Arrays are not equal");
            return;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("Both arrays are equal");
        }
        if (flag == false) {
            System.out.println("Both arrays are not equal");
        }
    }
}
