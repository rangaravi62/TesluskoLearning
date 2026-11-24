package DSAPatterns.Strings;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Ravi"));
    }

    static String reverseString(String str){
        String revString = "";

        for (int i = 0; i < str.length(); i++) {
            revString = str.charAt(i) + revString;
        }
        return revString;
    }
}
