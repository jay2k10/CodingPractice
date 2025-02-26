package ex_18022025;

public class CharVCCount {
    public static void main(String[] args) {
        String str = "i live in delhi";
        int vChar = 0;
        int cChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                vChar++;
            }
            else{
                cChar++;
            }

        }
        System.out.println("Vowel :"+vChar);
        System.out.println("Consonent :"+cChar);
    }
}
