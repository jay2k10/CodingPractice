package _ex23022025._priyankaBatch;

public class ReverseTheSentence {
    public static void main(String[] args) {
        String str = "Welcome to java";
        String[] arr = str.split("\s");
        String result = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            String word = arr[i];
            result = result + word + " ";

        }
        System.out.println(result);
    }
}
