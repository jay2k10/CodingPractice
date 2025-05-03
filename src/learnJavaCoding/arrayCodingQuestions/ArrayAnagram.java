package learnJavaCoding.arrayCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAnagram {
    public static void main(String[] args) {
        String[] arr = {"run", "race", "nur", "cera"};
        //create a new array list to store an element
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            //convert a string to a char array and sort it.
            char[] a1 = a.toCharArray();
            Arrays.sort(a1);
            for (int j = i + 1; j < arr.length; j++) {
                String b = arr[j];
                //convert a string to a char array and sort it.
                char[] a2 = b.toCharArray();
                Arrays.sort(a2);
                //Compare the sorted char array to check both are equal or not.
                if (Arrays.equals(a1, a2)) {
                    //Convert char arrays back to string and add them to the list.
                    list.add(a);
                    list.add(b);
                }
            }
        }
        System.out.println(list);
    }
}
