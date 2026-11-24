package DSAPatterns.TwoPointers;

public class ValidPalindrome {

    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
    //all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
        System.out.println(isValidPalindromeOptimal(str));
    }

    // TC -> O(N) SC -> O(N)
    static boolean isValidPalindrome(String str){
        String plainStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for (int i = 0; i < plainStr.length()/2; i++) {
            if(plainStr.charAt(i) != plainStr.charAt(plainStr.length() - i -1)) return false;
        }
        return true;
    }

    // TC -> O(N) SC -> O(1)
    static boolean isValidPalindromeOptimal(String str) {
        int i =0 ;
        int j = str.length() - 1;

        while (i <= j){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
                continue;
            }

            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) return false;
            i++;
            j--;

        }

        return true;
    }
}
