package Practice;

public class SumOfDigit1 {
    public static void main(String[] args) {
        int no = 456;
        int sum = 0;

        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;

        }
        System.out.println("Sum of digit is : " + sum);
    }
}
