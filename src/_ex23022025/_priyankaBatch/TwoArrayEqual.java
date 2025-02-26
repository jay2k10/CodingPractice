package _ex23022025._priyankaBatch;

public class TwoArrayEqual {
    public static void main(String[] args) {
        int[] a = {1, 2, 3,4};
        int[] b = {1, 2, 3,5};

        boolean flag = true;

        if (a.length == b.length) {
            //for (int i = 0; i <a.length; i++) //Both for loop is true.
            for (int i = 0; i <=a.length - 1; i++) {
                if (a[i] != b[i]) {
                    flag = false;
                }

            }
        } else {
            flag = false;
        }
        if (flag == true) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

}
