package ex_17022025;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str = "java is object oriented language";

        int result = str.length() - str.replaceAll("g", "").length();
        System.out.println("Occurance of a is :" + result);
    }
}
