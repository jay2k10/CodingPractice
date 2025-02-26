package _ex23022025;


public class Swap2number {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

//        a= a+b;
//        b= a-b;
//        a= a-b;

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(a);
        System.out.println(b);
    }


}
