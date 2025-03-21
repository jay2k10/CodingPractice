package Practice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.out.println("My name is "+name);
        System.out.println(name +",tell me your age");
        int age = sc.nextInt();
        System.out.println("your age is :"+age);
        sc.close();
    }
}
