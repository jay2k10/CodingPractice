package leetCode;

public class Leet005 {
    public static void main(String[] args) {
        int[] a = {3, 7, 2, 5, 8};
        int search = 5;
        boolean b = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                b = true;
            }
        }
        if (b == true) {
            System.out.println("Search element is present");
        }
        if (b == false) {
            System.out.println("Search element is not present");
        }
    }
}
