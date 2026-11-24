package DSAPatterns.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithAtMostKChars {
    public static void main(String[] args) {
        String str = "aababbcaacc";
        int k = 2;
        System.out.println(LongestSubstringWithAtMostKCharsBrute(str,k));
        System.out.println(LongestSubstringWithAtMostKCharsOptimal(str,k));
    }

    // TC -> O(N) SC -> O(min(n, k))
    static int LongestSubstringWithAtMostKCharsBrute(String str, int k) {
        int maxLen = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < len; j++) {
                set.add(str.charAt(j));
                if (set.size() > k) break;
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    // TC -> O(N) SC -> O(min(n, k))
    static int LongestSubstringWithAtMostKCharsOptimal(String str, int k) {
        int maxLen = 0;
        int len = str.length();

        int l = 0;
        int r = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (r < len) {
            char rchar = str.charAt(r);
            map.put(rchar, map.getOrDefault(rchar,0)+1);
            while (map.size() > k){
                char lchar = str.charAt(l);
                if(map.get(lchar) == 1) map.remove(lchar);
                else map.put(lchar, map.get(lchar) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }

    }
