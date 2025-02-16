package ex_16022025.ex_String1;

public class VCCount {
    public static void main(String[] args) {
        String str = "Happy";
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vCount++;

            } else {
                cCount++;
            }

        }
        System.out.println(vCount);
        System.out.println(cCount);

    }
}
