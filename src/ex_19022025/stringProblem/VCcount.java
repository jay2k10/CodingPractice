package ex_19022025.stringProblem;

public class VCcount {
    public static void main(String[] args) {
        String str = "pranavi";
        int v = 0;
        int c1 = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                v++;
            }else{
                c1++;
            }

        }
        System.out.println("Vowel :"+v);
        System.out.println("Consonent :"+c1);

    }
}
