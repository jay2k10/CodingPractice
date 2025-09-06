package leetCode;

public class Leet004 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        //int k = 4;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven = sumEven + a[i];
            }
            if (a[i] % 2 != 0) {
                sumOdd = sumOdd + a[i];
            }

        }
        System.out.println("Sum of even no is:" + sumEven);
        System.out.println("Sum of odd no is:" + sumOdd);
    }
}
