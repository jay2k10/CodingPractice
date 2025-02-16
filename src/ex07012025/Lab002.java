package ex07012025;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no i will tell you it is even or odd");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Given no is even");
        }else{
            System.out.println("Given no is odd");
        }
    }
}
