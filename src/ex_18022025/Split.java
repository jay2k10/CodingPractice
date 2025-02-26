package ex_18022025;

public class Split {
    public static void main(String[] args) {
        String str = "i live in delhi";
        String [] str1 = str.split("\s");
        for (String s :str1){
            System.out.println(s);
        }

    }
}
