package learnJavaCoding.stringCodingQuestions;

public class SortLongString {
    //String s = "priyanka is doing good in interview";
    // what is the short word and longest word in the string.
    public static void main(String[] args) {
        String s = "priyanka is doing good in interview";
        String[] s1 = s.split("\s");
        String longWord = s1[0];
        String smallWord = s1[0];

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            if (word.length() > longWord.length()) {
                longWord = word;
            }
            if (word.length() < smallWord.length()) {
                smallWord = word;
            }

        }
        System.out.println("Long word: " + longWord);
        System.out.println("small word: " + smallWord);
    }
}
