package _ex23022025;

public class SplitWord {
    public static void main(String[] args) {
        String str = "may name is jay";
        String [] str1 = str.split("\s");
        for(String s:str1){
            System.out.println(s);
        }
    }
}
