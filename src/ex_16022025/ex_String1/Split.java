package ex_16022025.ex_String1;

public class Split {
    public static void main(String[] args) {
        String str = "jay shankar";

        String[] str2 = str.split("\s");

        for (String s : str2) {
            System.out.println(s);
        }
    }
}
