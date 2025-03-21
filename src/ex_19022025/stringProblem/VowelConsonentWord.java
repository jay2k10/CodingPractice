package ex_19022025.stringProblem;

public class VowelConsonentWord {
    public static void main(String[] args) {
        String str = "i live in delhi";
        String [] s1 = str.split("\s");
        int v=0;
        int c1=0;

        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            char c = s2.charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                //System.out.println("Vowel word :"+s2);
                v++;
            }else{
                //System.out.println("Consonent word: "+s2);
                c1++;
            }

        }
        System.out.println(v);
        System.out.println(c1);
    }
}
