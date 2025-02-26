package ex_17022025;

public class L003 {
    public static void main(String[] args) {
        String str = "jay priya";
        String[] str2 = str.split("\s");
        String result = "";
        for (int i = 0; i < str2.length; i++) {
            String word = str2[i];

            result = result + " " + reverse(word);

        }
        System.out.println(result);


    }

    public static String reverse(String str) {
        String str1 = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            str1 = c + str1;

        }
        return str1;
    }


}
