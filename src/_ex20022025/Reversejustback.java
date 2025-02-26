package _ex20022025;

public class Reversejustback {
    public static void main(String[] args) {
        String str = "Welcome to java";
        String [] str1 = str.split("\s");
        String result = "";

        for (int i = str1.length-1; i>=0; i--) {
            String word = str1[i];

            result = result+word+" ";

        }
        System.out.println(result);
    }




}
