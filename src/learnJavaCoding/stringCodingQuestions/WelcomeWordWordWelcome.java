package learnJavaCoding.stringCodingQuestions;

public class WelcomeWordWordWelcome {
    public static void main(String[] args) {
        String s = "Welcome Word";
        String [] s2 = s.split("\s");
        String s3 = "";

        for (int i = s2.length-1; i >=0 ; i--) {
            String word = s2[i];
             s3 = s3 + " "+word;

        }
        //System.out.println(s3);
        String s4 = s+" "+s3;
        System.out.println("Output is: "+s4);
    }
}
