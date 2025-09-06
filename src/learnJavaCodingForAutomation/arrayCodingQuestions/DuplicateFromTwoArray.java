package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.ArrayList;

public class DuplicateFromTwoArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 1, 5, 6};
        ArrayList list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                }
            }
        }
        System.out.println("Common array is: " + list);
    }
}
