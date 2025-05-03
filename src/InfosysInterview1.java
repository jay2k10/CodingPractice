public class InfosysInterview1 {
    public static void main(String[] args) {
        int[] a = {1, 6, 9, 15, 3};
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("Maximum no in an array is :" + max);
        System.out.println("Minimum no in an array is :" + min);

    }
}
