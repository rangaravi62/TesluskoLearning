package DSAPatterns.TwoPointers;

public class ReverseAStringByKeepingVowelsInPosition {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseStringByKeepingVowelsInPosition(str));
    }

    // TC -> O(N) SC -> O(N)
    static String reverseStringByKeepingVowelsInPosition(String str){

        char[] chars = str.toCharArray();

        int len = str.length()-1;
        int i = 0;
        int j = len;

        while (i <= j){
            if(isVowel(chars[i])) {
                i++;
                continue;
            }

            if (isVowel(chars[j])){
                j--;
                continue;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;

        }

        return new String(chars);
    }

    static boolean isVowel(char c){
        if(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e') return true;
        return false;
    }
}
