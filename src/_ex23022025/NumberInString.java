package _ex23022025;

public class NumberInString {
    public static void main(String[] args) {
        String s = "jay1shankar2";
        char[] c = s.toCharArray();

        int sum = 0;

        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int k = Character.getNumericValue(c[i]);

                sum = sum + k;
            }

        }
        System.out.println(sum);

    }
}