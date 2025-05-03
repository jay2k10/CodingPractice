public class InfosysInterview3 {
    public static void main(String[] args) {
        String s = "Jay Shankar";
        String[] s3 = s.split("\s");
        String result = "";
        for (int i = 0; i < s3.length; i++) {
            String word = s3[i];
            result = result + " " + reverseString(word);
        }
        System.out.println("Reverse String is: " + result);
    }

    public static String reverseString(String s) {
        char c;
        String s2 = "";
        //System.out.println("Input String is :" + s);

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s2 = c + s2;
        }
        return s2;
    }
}
