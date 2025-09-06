public class Gspan {
    public static void main(String[] args) {
        String s = "jay12379shankar";
        //output jay shankar
        StringBuilder sb = new StringBuilder();
        boolean space = false;

        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (!space) {
                    sb.append(' ');
                    space = true;
                }

            } else {
                sb.append(c);
            }
        }
        String s3 = sb.toString();
        System.out.println("Output String is :" + s3);
    }
}
