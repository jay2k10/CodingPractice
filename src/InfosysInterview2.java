public class InfosysInterview2 {
    public static void main(String[] args) {
        String s = "Jay Shankar";
        char c;
        String s2 = "";
        System.out.println("Input String is :" + s);

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s2 = c + s2;
        }
        System.out.println("Rev String is :" + s2);
    }
}
