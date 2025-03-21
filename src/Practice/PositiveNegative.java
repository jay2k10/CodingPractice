package Practice;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int input = sc.nextInt();

        if(input>0){
            System.out.println("Positive");

        } else if (input<0) {
            System.out.println("Negative");

        }else{
            System.out.println("zero");
        }
    }
}
