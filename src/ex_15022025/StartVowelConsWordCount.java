package ex_15022025;

import java.util.Arrays;

public class StartVowelConsWordCount {
    public static void main(String[] args) {
        String str = "My name is jay shankar";
        int vCount = 0;
        int cCount = 0;

        String [] str1 = str.split("\s");
        System.out.println(Arrays.stream(str1).toList());

        for (int i = 0; i < str1.length; i++) {
            String word = str1[i];
            char c = word.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vCount++;
                System.out.println("v"+word);
            }else{
                cCount++;
                System.out.println("C"+word);
            }



        }
        //System.out.println(vCount);
       // System.out.println(cCount);
    }
}
