package ex_15022025;

import java.util.Arrays;

public class MaxMinSalary {
    public static void main(String[] args) {
        int[] salaries = {100, 500, 200, 50, 1000, 999};
        System.out.println(Arrays.toString(salaries));

        int max = 0;
        int min = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];


            }
            if (salaries[i] < min) {
                min = salaries[i];
            }

        }
        System.out.println("Max salaries is :" + max);
        System.out.println("Min salaries is :" + min);
    }
}
