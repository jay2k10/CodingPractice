package learnJavaCodingForAutomation.arrayCodingQuestions;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 1, 8, 9, 6};
        int big = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>big){
                big=a[i];
            }
        }
        System.out.println("Biggest no is: "+big);
    }
}
