package _ex23022025;

public class Palindrom {
    public static void main(String[] args) {
        String str = "naman";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        if (str.equals(str1)) {

            System.out.println("Palindrom !!");
        }else{
            System.out.println("Not a palindron!!");
        }
    }
}
