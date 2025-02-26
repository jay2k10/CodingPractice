package ex_18022025;

public class Palindrom {
    public static void main(String[] args) {
        String str = "namanj";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        if(str.equals(str1)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not a palindrom");
        }
    }
}
