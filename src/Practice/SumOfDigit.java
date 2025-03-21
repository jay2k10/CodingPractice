package Practice;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no = sc.nextInt();
        System.out.println(sumOfDigit(no));
    }

    public static int sumOfDigit(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        return sum;
    }
}
