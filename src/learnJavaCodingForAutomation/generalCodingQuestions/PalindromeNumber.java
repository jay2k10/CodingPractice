package learnJavaCodingForAutomation.generalCodingQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 16461;
        int originalNo = no;
        int reverse = 0;

        while (no != 0) {
            reverse = reverse * 10 + no % 10;
            no = no / 10;
        }
        System.out.println("Reverse no is:" + reverse);
        System.out.println("Reverse no is:" + originalNo);
        if (reverse == originalNo) {
            System.out.println("Number is palindrome!!");
        } else {
            System.out.println("Number is not a palindrome!!");
        }

    }
}
