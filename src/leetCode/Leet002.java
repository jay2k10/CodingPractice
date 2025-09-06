package leetCode;

public class Leet002 {
    public static void main(String[] args) {
        String s = "$%^&*223322323";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }

        }
        String s1 = sb.toString();
        System.out.println("After removing special char :" + s1);
    }
}
