public class Gspan03 {
    public static void main(String[] args) {
        String s = "jay1234shankar";
        //output should be jay10shankar
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (sum != 0) {
                    sb.append(sum);
                    sum = 0;
                }
                sb.append(c);

            } else {
                int x = Character.getNumericValue(c);
                sum = sum + x;
            }

        }
        String s3 = sb.toString();
        System.out.println(s3);
    }
}
