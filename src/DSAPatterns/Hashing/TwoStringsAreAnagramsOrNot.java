package DSAPatterns.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoStringsAreAnagramsOrNot {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areTwoStringsAnagrams(s1,s2));
        System.out.println(areTwoStringsAnagramsUsingArray(s1,s2));

    }

    // TC -> O(NlogN), SC -> O(N)
    static boolean areTwoStringsAnagramsBruteForce(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    // TC -> O(N), SC -> O(K), where k is the number of distinct characters.
    static boolean areTwoStringsAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i),0)-1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        return true;
    }


    // TC -> O(N), SC -> O(1)
    static boolean areTwoStringsAnagramsUsingArray(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
