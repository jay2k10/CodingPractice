package _ex23022025._priyankaBatch;

public class StringContainingDigit {
    public static void main(String[] args) {
        String str = "jay";

        char[] arr = str.toCharArray();
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("String contains digit");
        } else {
            System.out.println("String not contains digit");
        }
    }
}
