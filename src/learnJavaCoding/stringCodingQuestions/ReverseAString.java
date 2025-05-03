package learnJavaCoding.stringCodingQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "i am an interviewer";
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s1 = c+s1;
        }
        System.out.println("After reversing: "+s1);
    }
}
