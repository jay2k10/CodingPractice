public class CG001 {
    public static void main(String[] args) {
        String s = "I Love Java Programming";

        //System.out.println("Reverse string is: "+s1);
    }
    public static String reverseString(String s){
        char c;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            c= s.charAt(i);
            s1 = c+s1;
        }
        return s1;
    }
}
