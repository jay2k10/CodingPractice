package learnJavaCodingForAutomation.stringCodingQuestions;

import java.util.Stack;

public class ReverseStringWithoutNoAndSpecialChar {
    public static void main(String[] args) {
        String s = "itest@59auto";
        //output should be "tseti@59otua"
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                stack.push(c);
            } else {
                while (stack.size() > 0) {
                    sb.append(stack.pop());
                }
                sb.append(c);
            }
        }
        while (stack.size() > 0) {
            sb.append(stack.pop());
        }
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
