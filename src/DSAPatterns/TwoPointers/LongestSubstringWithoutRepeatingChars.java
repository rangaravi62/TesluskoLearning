package DSAPatterns.TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String str = "abcddabac";
        String str1 = "aaabbbccc";
        System.out.println(longestSubstringBruteForce(str));
        System.out.println(longestSubstringBruteForce(str1));
        System.out.println(longestSubstringOptimal(str));
        System.out.println(longestSubstringOptimal(str1));

    }

    // TC -> O(N^2) SC -> O(len)
    static int longestSubstringBruteForce(String str){
        int len  = str.length();
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < len; j++) {
                if(map.containsKey(str.charAt(j))) break;
                map.put(str.charAt(j),j);
                maxLen = Math.max(maxLen, j-i+1 );
            }
        }
        return maxLen;
    }

    // TC -> O(N) SC -> O(N)
    static int longestSubstringOptimal(String str){

        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        int r = 0;
        int len  = str.length();
        while (r<len){
            char c = str.charAt(r);
            if(map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }

            map.put(c,r);
            maxLen = Math.max(r-l+1,maxLen);
            r++;
        }
        return maxLen;
    }
}
