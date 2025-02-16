package ex07012025;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = sc.next();
        switch (day){
            case "M":
                System.out.println("Monday");
                break;
            case "T":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
