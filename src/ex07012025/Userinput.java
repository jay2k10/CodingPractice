package ex07012025;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        sc.useDelimiter("\\n"); // for spacing between two no
        String name = sc.next();
        System.out.println("Your name is :" +name);

    }
}
