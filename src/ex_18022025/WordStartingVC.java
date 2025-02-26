package ex_18022025;

public class WordStartingVC {

    public static void main(String[] args) {
        String s = "i live in delhi amrawati";
        String [] s1 = s.split("\s");
        int v = 0;
        int c1 =0;


        for (int i = 0; i < s1.length; i++) {
            String w = s1[i];
            char c = w.charAt(0);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                v++;
                System.out.println("Vowel Word :"+w);
            }else {
                System.out.println("Cons word :"+w);
                c1++;
            }

        }
        System.out.println(v);
        System.out.println(c1);
    }
}
