package ex_15022025;

public class NumberReverse {
    public static void main(String[] args) {

        int a = 123;
        int r = a % 10;
        a = a / 10;
        int r2 = a % 10;
        a = a / 10;
        int r3 = a%10;

        int finalNumber = r*100+r2*10+r3;
        System.out.println(finalNumber);

    }
}
