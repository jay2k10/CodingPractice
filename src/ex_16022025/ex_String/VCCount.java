package ex_16022025.ex_String;

import java.sql.SQLOutput;

public class VCCount {
    public static void main(String[] args) {
        String str = "my name is jay shankar";
        System.out.println(str);
        String str1 = str.replace(" ", "");
        System.out.println(str1);

        int VCount = 0;
        int CCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                VCount++;

            } else {
                CCount++;
            }

        }
        System.out.println("Vowel count is :" + VCount);
        System.out.println("Consonent count is :" + CCount);
    }
}
