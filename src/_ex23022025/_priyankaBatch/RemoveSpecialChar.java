package _ex23022025._priyankaBatch;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "jay@$$123";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (Character.isAlphabetic(a)) {
                sb.append(a);

            }
            else if (Character.isDigit(a)) {
                sb1.append(a);

            }
            else  {
                sb2.append(a);

            }


        }
        String s1 = sb2.toString();
        System.out.println(s1);


    }
}
