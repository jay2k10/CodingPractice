package learnJavaCoding.stringCodingQuestions;

public class PrintString {
    public static void main(String[] args) {
        //input String s = "Automation Testing Software Engineer"
        //output should be Testing Software Engineer
        String s = "Automation Testing Software Engineer";
        String result = "";

        String [] s1 = s.split("\s");
        for (int i = 0; i < s1.length; i++) {
            String word = s1[0];
            result = s1[1]+" "+s1[2]+" "+s1[3];


        }
        System.out.println(result);
    }
}
