package learnJavaCoding.arrayCodingQuestions;

public class SearchElement {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 8, 9};
        int search = 10;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Element is present in an array");
        }
        if (flag == false) {
            System.out.println("Element is not present in an array");
        }
    }
}
