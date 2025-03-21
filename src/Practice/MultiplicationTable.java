package Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        multiplication();

    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(no+" X "+i +"="+(no*i));
            i++;
        }

    }
}
