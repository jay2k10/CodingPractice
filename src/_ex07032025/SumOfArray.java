package _ex07032025;

public class SumOfArray {

    /*Write a program to take an array of integers as input and calculate the sum of
     all elements in the array.*/
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8};
        int total = 0;
        for (int k : arr) {
            total = total + k;
        }
        System.out.println(total);


    }
}
