package _ex23022025._priyankaBatch;

public class IntegerSuminString {
    public static void main(String[] args) {
        String s = "jay12shankar34";
        int sum = 0;
        //char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int k = Character.getNumericValue(c);

                sum = sum + k;
            }

        }
        System.out.println(sum);
    }
}
