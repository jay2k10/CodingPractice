package learnJavaCodingForAutomation.arrayCodingQuestions;

import java.util.Arrays;

public class OddFirstEvenLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;
        int[] newArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                newArray[index] = a[i];
                index++;
            }
        }
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    newArray[index] = a[i];
                    index++;
                }
            }
            System.out.println("New Array is: "+Arrays.toString(newArray));
        }
    }
