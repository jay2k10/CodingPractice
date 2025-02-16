package ex_15022025;

public class RemoveWhiteSpacesInaString {
    public static void main(String[] args) {
        String str = "my name is jay shankar";
        String str2 = str.replaceAll(" ", "");
        System.out.println(str2);

    }
}
