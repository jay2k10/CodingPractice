package Practice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no :");
        int first = sc.nextInt();
        System.out.println("Enter 2nd no :");
        int second = sc.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of no is :" + lcm);

    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;

        }

    }

}
