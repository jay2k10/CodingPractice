package ex_16022025.ex_String;

public class StartVowelandConsWord {
    public static void main(String[] args) {
        String str = "aai shree ram";

        int vCount =0;
        int cCount =0;
        String [] str1 = str.split("\s");

        for (int i = 0; i < str1.length; i++) {
            String word = str1[i];
            char c = word.charAt(0);

            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                vCount++;
                System.out.println("Vowel words :"+word);

            }else{
                cCount++;
                System.out.println("Consonent word :"+word);
            }

        }
        System.out.println("Starting from Vowel :"+vCount);
        System.out.println("Starting from Consonent :"+cCount);
    }
}
