package _ex23022025._priyankaBatch;

public class AlphabetDigitSpecial {
    public static void main(String[] args) {
        String str = "Naman@#123";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                sb1.append(c);
            } else {
                sb2.append(c);
            }
        }
        String alphabet = sb.toString();
        String digit = sb1.toString();
        String special = sb2.toString();

        System.out.println("Alphabets are :" + alphabet);
        System.out.println("Digits are :" + digit);
        System.out.println("Special Symbols are :" + special);
    }
}
