package learnJavaCoding.arrayCodingQuestions;

import java.util.Arrays;

public class SecondLargestSecondSmallest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != a[a.length - 1]) {
                System.out.println("2nd heighest no is: " + a[i]);
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[i + 1]) {
                System.out.println("2nd smallest no is: " + a[i + 1]);
                break;
            }
        }
    }
}
