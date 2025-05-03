package learnJavaCoding.arrayCodingQuestions;

import java.util.ArrayList;

public class CommonInStringArray {
    public static void main(String[] args) {
        String[] a = {"jay", "hey", "naman", "hey", "pranavi", "naman"};
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    list.add(a[i]);
                }
            }
        }
        System.out.println("Common Array string is: " + list);
    }
}
