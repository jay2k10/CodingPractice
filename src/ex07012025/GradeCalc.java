package ex07012025;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int a = sc.nextInt();
        char grade = 'F';

        if (a >= 90 && a <= 100) {
            grade = 'A';

        } else if (a >= 80 && a <= 89) {
            grade = 'B';

        } else if (a >= 70 && a <= 79) {
            grade = 'C';

        }
//        else{
//            grade='F';
//        }
        System.out.println(grade);

    }
}
