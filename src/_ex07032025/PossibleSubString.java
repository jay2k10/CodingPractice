package _ex07032025;

public class PossibleSubString {
    public static void main(String[] args) {
        generateSubstring("abcde");
    }

    public static void generateSubstring(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j <= size; j++) {
                String subString = s.substring(i, j);
                System.out.println(subString);

            }

        }

    }


}
