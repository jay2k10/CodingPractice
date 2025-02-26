package _ex23022025;

public class LastWordToFirst {
    public static void main(String[] args) {
        String str = "To help us make your experience even better";
        String [] str1 = str.split("\s");
        String result="";

        for (int i = str1.length-1; i >=0 ; i--) {
            String word = str1[i];

            result = result+word+" ";

        }
        System.out.println(result);
    }
}
