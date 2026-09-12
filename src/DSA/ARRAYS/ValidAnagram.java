package DSA.ARRAYS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ab";
        String t = "ba";

        System.out.println(isValidAnagramOptimal(s,t));
    }


    // TC -> O(N*logN) SC -> O(N)
    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        s = new String(sChars);
        t = new String(tChars);

        if(s.equals(t)) return true;
        return false;

        // or we can use return Arrays.equals(sChars, tChars);

    }


    // TC -> O(N) SC -> O(N)
    static boolean isValidAnagramOptimal(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i), 0) - 1);
        }

       for (Integer val : map.values()){
           if(val != 0) return false;
       }

       return true;
    }

}
