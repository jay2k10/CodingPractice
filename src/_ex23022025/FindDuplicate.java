package _ex23022025;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {2,5,7,8,1,1,9,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }

            }

        }
    }
}
