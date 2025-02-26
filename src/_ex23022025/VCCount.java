package _ex23022025;

public class VCCount {
    public static void main(String[] args) {
        String str = "may name is jayshankar";
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                vCount++;
            }else{
                cCount++;
            }

        }
        System.out.println("Vowel :"+vCount);
        System.out.println("Consonent :"+cCount);
    }
}
