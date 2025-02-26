package _ex23022025._priyankaBatch;

public class SpecialDigitString {
    public static void main(String[] args) {
        String s = "jay12@!#";
        //char [] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        //StringBuilder sb1 = new StringBuilder();
        //StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);

            }

        }
        String sDigit = sb.toString();
        System.out.println(sDigit);



    }
}


