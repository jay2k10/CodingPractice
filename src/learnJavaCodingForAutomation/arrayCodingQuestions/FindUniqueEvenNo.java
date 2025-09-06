package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueEvenNo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 4};
        ArrayList list = new ArrayList();
        Set set = new HashSet();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                set.add(a[i]);
            }
        }
        System.out.println("Duplicate even no is: " + set);
    }
}
