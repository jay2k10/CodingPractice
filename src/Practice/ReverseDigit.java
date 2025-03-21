package Practice;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = rev(250);
        System.out.println(n);

    }

    public static int rev(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        return rev;
    }
}
