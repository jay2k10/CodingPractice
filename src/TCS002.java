public class TCS002 {
    public static void main(String[] args) {
        String s = "abcd1234@#%";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                sb1.append(c);
            } else {
                sb2.append(c);
            }
        }
        String alpha = sb.toString();
        String digit = sb1.toString();
        String special = sb2.toString();
        System.out.println("Alpha: " + alpha);
        System.out.println("Digit: " + digit);
        System.out.println("Special: " + special);
    }
}
