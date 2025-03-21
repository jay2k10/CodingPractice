package Practice;

public class AddOddNumbers {
    public static void main(String[] args) {
        oddSums();

    }

    public static void oddSums() {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum = sum + i;
            i = i + 2;

        }
        System.out.println("Odd sum is :" + sum);

    }
}
