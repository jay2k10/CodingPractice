package ex_13022025;

public class PalindromCheck {
    public static void main(String[] args) {
        String str = "anna";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        if(str.equals(str1)){
            System.out.println("String is palindrom!!");

        }else{
            System.out.println("String is not a palindrom!!");
        }
    }
}
