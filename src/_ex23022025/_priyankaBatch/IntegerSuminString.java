package _ex23022025._priyankaBatch;

public class IntegerSuminString {
    public static void main(String[] args) {
        String s = "jay12shankar34";
        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                int k = Character.getNumericValue(arr[i]);

                sum = sum + k;
            }

        }
        System.out.println(sum);
    }
}
