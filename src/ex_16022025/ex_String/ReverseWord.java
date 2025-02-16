package ex_16022025.ex_String;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "may name is jay";
        String[] str1 = str.split("\s");
        String finalword = "";
        for (int i = 0; i < str1.length; i++) {
            String word = str1[i];
            finalword = finalword +" "+reverse(word);


        }
        System.out.println(finalword);



    }

    public static String reverse(String str) {
        String str1 = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str1 = c+str1;


        }
        return str1;


    }

}
