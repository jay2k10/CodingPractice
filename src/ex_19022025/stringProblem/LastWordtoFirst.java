package ex_19022025.stringProblem;

public class LastWordtoFirst {
    public static void main(String[] args) {
        String str = "i live in delhi";
        String [] s= str.split("\s");
        String result = "";

        for (int i = s.length-1; i >=0; i--) {
            String w = s[i];

            result = result+w+" ";

        }
        System.out.println(result);
    }
}
