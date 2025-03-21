package Practice;

import java.util.Scanner;

public class Gretest3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no :");
        int input1 = sc.nextInt();
        System.out.println("Enter 2nd no :");
        int input2 = sc.nextInt();
        System.out.println("Enter 3rd no :");
        int input3 = sc.nextInt();

        if(input1>=input2 && input1>=input3){
            System.out.println(input1 + "is greater");
        }else if(input2>=input1 && input2>=input3){
            System.out.println(input2 + "is greater");
        }else{
            System.out.println(input3 + "is greater");
        }
        sc.close();
    }
}
