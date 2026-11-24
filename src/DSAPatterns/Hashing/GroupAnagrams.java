package DSAPatterns.Hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagramsOptimal(strs));

    }

    // TC -> O(N*klogk) N-> number of strings, k -> max length of a string , SC -> O(N*K)
    static Map<String, List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            String str = strs[i];
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);
            List<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);
            map.put(sortedStr,list);
        }
        return map;
    }

    // TC -> O(N*k) N-> number of strings, k -> max length of a string , SC -> O(N*26)
    static Map<String, List<String>> groupAnagramsOptimal(String[] strs) {
        int len = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int[] freq = new int[26];
            String str  = strs[i];
            for (int j = 0; j < str.length(); j++) {
                freq[str.charAt(j) - 'a'] = freq[str.charAt(j) - 'a'] + 1;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
        }
        return map;
    }
    }
