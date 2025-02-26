package _ex23022025._priyankaBatch;

public class SumIntegerString {
    public static void main(String[] args) {
        String str = "12jay 23shankar";
        String str1 = str.replace(" ", "");
        System.out.println(str1);
        char[] arr = str1.toCharArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                int k = Character.getNumericValue(arr[i]);
                sum = sum + k;
            }

        }
        System.out.println(sum);
    }
}
