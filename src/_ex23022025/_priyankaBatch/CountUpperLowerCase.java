package _ex23022025._priyankaBatch;

public class CountUpperLowerCase {
    public static void main(String[] args) {
        String s = "My name is Jay";
        int upper = 0;
        int lower = 0;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                total++;
            }
            if (c >= 'A' && c <= 'Z') {
                upper++;
            }
            if (c >= 'a' && c <= 'z') {
                lower++;
            }
        }
        System.out.println("Total Upper case :" + upper);
        System.out.println("Total Lower case :" + lower);
        System.out.println("Total count :" + total);
    }
}
