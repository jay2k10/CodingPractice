package learnJavaCodingForAutomation.stringCodingQuestions;

import java.util.Arrays;

public class Goodmorninggoodafternoongoodnight {
    public static void main(String[] args) {
        //output should be "goodmorninggoodafternoonbadnight"
        //Replace 3rd good with bad
        String s = "goodmorninggoodafternoongoodnight";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        // Split around the target word
        String[] s1 = s.split("good");

        System.out.println(Arrays.toString(s1));
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);

        }
        for (int i = 0; i < s1.length; i++) { // the last part doesn't need a "good" after it
            String word = s1[i];
            if (i > 0) {
                count++;
                if (count == 3) {
                    sb.append("bad");
                } else {
                    sb.append("good");
                }
            }
            sb.append(s1[i]);


        }
        String s3 = sb.toString();
        System.out.println( s3);
    }
}