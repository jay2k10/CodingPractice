public class InfosysFriday {
    public static void main(String[] args) {
        String s = "this is cat";
        //output should be: This Is Cat
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split("\s");

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            char c = word.charAt(0);
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
