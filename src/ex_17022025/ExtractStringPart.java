package ex_17022025;

public class ExtractStringPart {
    public static void main(String[] args) {
        String str = "www.hdor.com";

        String firstFourChar = str.substring(0,4);
        System.out.println(firstFourChar);

        //String lastFourChar = str.substring(8,12);
        String lastFourChar = str.substring(str.length()-4,str.length());
        System.out.println(lastFourChar);

        String webSite = str.substring(4,str.length()-4);
        System.out.println(webSite);
    }
}
