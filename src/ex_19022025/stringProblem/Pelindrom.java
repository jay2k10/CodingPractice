package ex_19022025.stringProblem;

public class Pelindrom {
    public static void main(String[] args) {
        String s = "namang";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();
        if(s.equals(s2)){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
