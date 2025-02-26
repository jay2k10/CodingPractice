package ex_16022025.ex_String;

import java.util.ArrayList;

public class WordVCCount {
    public static void main(String[] args) {
        print();

    }

    public static void print() {

        String str = "Jay Shankar prasad varun ashwin";

        String[] words = str.split("\\s+");

        ArrayList<String> vowels = new ArrayList<>();

        ArrayList<String> consonant = new ArrayList<>();

        for (String word : words) {

            if (!word.isEmpty()) {

                char firstChar = Character.toLowerCase(word.charAt(0));

                if ("aeiou".indexOf(firstChar) != -1) {

                    vowels.add(word);

                } else if (Character.isLetter(firstChar)) {

                    consonant.add(word);
                }
            }
        }

        for (String vow : vowels) {
            System.out.println(vow + " ");
        }

        System.out.println();

        for (String con : consonant) {

            System.out.print(con + " ");
        }
    }
}
