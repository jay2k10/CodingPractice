package Practice;

public class Parameter {
    public static void main(String[] args) {
        message();
        int x = sumTwoNumber(4, 8);
        System.out.println(x);

    }

    public static void message() {
        System.out.println("Addition of two number");
    }

    public static int sumTwoNumber(int a, int b) {
        System.out.println("Received a: " + a);
        System.out.println("Received b: " + b);
        int sum = a + b;
        return sum;
    }
}
