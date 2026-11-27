package DSAPatterns.TwoPointers;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String str = "IceCream";
        System.out.println(reverseVowels(str));
    }


    // TC -> O(N) Sc -> O(N)
    public static String reverseVowels(String s) {
        int len  = s.length();
        char[] arr = s.toCharArray();
        int l = 0;
        int r = len-1;
        while(l <= r){
            if(!isVowel(arr[l])) {
                l++;
                continue;
            }
            if(!isVowel(arr[r])) {
                r--;
                continue;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) >= 0;
    }
}
