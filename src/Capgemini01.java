public class Capgemini01 {
    public static void main(String[] args) {
        String s = "Hello Word";
        String s2 = "";
        char c;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s2 = c+s2;
        }
        System.out.println(s2);
        String [] s3 = s2.split("\s");
        for (int i = 0; i < s3.length; i++) {
             word = s3[1];
        }
        System.out.println(word);
    }
}
