package _ex20022025;

public class ReverseAtPosition {
    public static void main(String[] args) {
        String str = "Welcome to java";
        String [] str3 = str.split("\s");
        String result = "";
        for (int i = 0; i < str3.length; i++) {
            String word = str3[i];

            result = result+ " "+reverse(word);

        }
        System.out.println(result);



    }
    public static String reverse(String str){
        String str2 ="";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c= str.charAt(i);

            str2 = c+str2;

        }
        return str2;

    }




}
