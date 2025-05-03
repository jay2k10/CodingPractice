package learnJavaCoding.arrayCodingQuestions;

public class TargetMatchIndex {
    //Array a = {6,8,11,6,7,18) Target =17,
    // write a program to print index of any two-array element whose sum = target
    public static void main(String[] args) {
        int [] arr = {6,8,11,6,7,18};
        int target = 17;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Index of i: "+i +" : "+"index of j: "+j);
                }

            }

        }
    }
}
