package Practice;

public class Swap2Number {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        int c = a+b;
        a=c-a;
        b=c-a;
        System.out.println(a);
        System.out.println(b);
    }
}
