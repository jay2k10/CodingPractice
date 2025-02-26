package _ex23022025._priyankaBatch;

public class SumIntegerString2 {
    public static void main(String[] args) {
        String str = "12jay 23shankar";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!= ' '){
                res = res+str.charAt(i);

            }

        }
        char [] c = res.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if(Character.isDigit(c[i])){
                int k = Character.getNumericValue(c[i]);
                sum = sum+k;
            }

        }
        System.out.println(sum);

    }
}
