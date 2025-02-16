package ex_16022025.ex_String1;

public class StartVC {
    public static void main(String[] args) {
        String str = "jay shankar ajad ehds whfs";
        int v = 0;
        int c = 0;

        String s1[] = str.split("\s");
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            char c1 = word.charAt(0);
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {

                v++;
            } else {
                 c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
}
