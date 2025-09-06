package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int[] a = {1, 3, 0, 4, 0, 6, 7, 0};
        int nonZero =0;
        System.out.println("Original array is: " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                a[nonZero]=a[i];
                nonZero++;
            }

        }
        while(nonZero<a.length){
            a[nonZero]=0;
            nonZero++;
        }
        System.out.println("Sorted Array is: " + Arrays.toString(a));
    }
}
