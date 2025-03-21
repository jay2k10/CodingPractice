package _ex07032025;

public class CombineTwoArray {
    public static void main(String[] args) {
        int [] a = {1,2,4};
        int [] b = {3,5,6,};

        int [] combineArray = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            combineArray[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            combineArray[a.length+i] = b[i];

        }
        for(Integer k :combineArray){
            System.out.println(k);
        }
    }
}
