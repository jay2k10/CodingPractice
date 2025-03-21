package Practice;

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println(fact);

    }
    public static long factorial( int num){

        if(num<2){
            return 1;
        }

      long fact = 1;
        int i=2;
        while(i<=num){
            fact = fact*i;
            i++;
        }
return fact;
    }
}
