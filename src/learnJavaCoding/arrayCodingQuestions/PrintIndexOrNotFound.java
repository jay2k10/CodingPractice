package learnJavaCoding.arrayCodingQuestions;

import java.util.Scanner;

public class PrintIndexOrNotFound {
    public static void main(String[] args) {
       int [] a =  {1,3,3,4,5,6,6,7,8,9,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int no = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==no){
                System.out.println("Found Index is: "+i);
            }
        }
        System.out.println("Element not found!!");
    }
}
