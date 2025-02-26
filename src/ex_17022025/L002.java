package ex_17022025;

public class L002 {
    public static void main(String[] args) {
        String s = "Jay Shankar";
        String[] s1 = s.split("\s");
        String reverse = "";

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            reverse = reverse+ " "+reverse(word);

        }
        System.out.println(reverse);

    }
    public static String reverse(String s){
        String s2 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c= s.charAt(i);
            s2 = c+s2;
        }
        return s2;
    }
}
