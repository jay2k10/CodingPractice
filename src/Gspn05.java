public class Gspn05 {
    public static void main(String[] args) {
        String s = "my name is jayshankar";
        String[] s1 = s.split("\s");

        String longest = s1[0];

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            if (word.length() > longest.length()) {
                longest = word;
            }

        }
        System.out.println("Longest word is: " + longest);

    }
}
