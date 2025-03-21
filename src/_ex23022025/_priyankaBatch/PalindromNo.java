package _ex23022025._priyankaBatch;

public class PalindromNo {
    public static void main(String[] args) {
        int no = 16461;
        int original = no;
        int rev = 0;

        while (no != 0) {
            rev = rev * 10 + no % 10;
            no = no / 10;
        }
        //System.out.println(rev);

        if (rev == original) {
            System.out.println("palindrom!!");
        } else {
            System.out.println("not palindrom");
        }
    }
}
