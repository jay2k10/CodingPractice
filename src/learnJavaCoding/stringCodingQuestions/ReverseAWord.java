package learnJavaCoding.stringCodingQuestions;

public class ReverseAWord {
    public static void main(String[] args) {
        String s = "Jay Shankar Prasad";
        String[] s2 = s.split("\s");
        String s3 = "";

        for (int i = s2.length - 1; i >= 0; i--) {
            String word = s2[i];
            s3 = s3 + word + " ";

        }
        System.out.println("Reverse word is :"+s3);
    }
}
