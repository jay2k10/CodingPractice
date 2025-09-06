package learnJavaCodingForAutomation.arrayCodingQuestions;

public class FindCommonElement {
    public static void main(String[] args) {
        int[] a = {6, 8, 11, 6, 7, 18,11,8};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.println("Common element is: "+a[i]);
                }
            }
        }
    }
}
