package learnJavaCodingForAutomation.stringCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestInString {
    public static void main(String[] args) {
        String s = "jay1024shankar";
        ArrayList list = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                list.add(c);
            }
        }
        System.out.println(list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("2nd largest no is :" + (list.size() - 2));
            break;
        }
    }
}
