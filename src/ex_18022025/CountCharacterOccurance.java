package ex_18022025;

public class CountCharacterOccurance {
    public static void main(String[] args) {
         String str = "java is object oriented language";

         int result = str.length() - str.replaceAll("a","").length();
        System.out.println("Occurance of a :"+result);
    }
}
