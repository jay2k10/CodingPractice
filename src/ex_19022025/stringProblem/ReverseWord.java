package ex_19022025.stringProblem;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "i live in delhi";
        String [] s2 = s.split("\s");
        String result = "";
        for (int i = 0; i < s2.length; i++) {
            String word = s2[i];
            result = result+" "+reverse(word);

        }
        System.out.println(result);



    }
    public static String reverse(String s){
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            s1 = c + s1;

        }
        return s1;

    }
}


