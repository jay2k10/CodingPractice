public class Cap001 {
    public static void main(String[] args) {
        String s = "jay";
        String s1 = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            s1 = c + s1;

        }
        if (s.equals(s1)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

    }
}
