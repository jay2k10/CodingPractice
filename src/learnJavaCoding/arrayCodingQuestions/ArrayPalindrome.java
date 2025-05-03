package learnJavaCoding.arrayCodingQuestions;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5};
        boolean b = true;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                b = false;
            }

        }
        if (b == true) {
            System.out.println("Array is palindrome");
        }
        if (b == false) {
            System.out.println("Array is not a palindrome");
        }
    }
}
