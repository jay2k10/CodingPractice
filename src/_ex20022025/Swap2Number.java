package _ex20022025;

public class Swap2Number {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;


//       int t=a;
//       a=b;
//       b=t;

//        a = a + b;
//        b = a - b;
//        a = a - b;

        a = a * b;
        b = a / b;
        a = a / b;


        System.out.println(a);
        System.out.println(b);
    }
}
