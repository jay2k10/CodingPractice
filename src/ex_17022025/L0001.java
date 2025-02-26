package ex_17022025;

public class L0001 {
    public static void main(String[] args) {
        String s = "my name is jay";
        String [] s1 = s.split("\s");
        String result = "";
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            result = result+" "+reverse(word);


        }
        System.out.println(result);



    }
    public static String reverse(String s){
        String s12="";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s12 = c+s12;

        }return s12;


    }




}
