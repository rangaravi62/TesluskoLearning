package DSAPatterns.Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbcddee";
        System.out.println(firstNonRepeatingCharacter(s));
    }

    // TC -> O(N) SC -> O(K) K -> No of Distinct Characters
    static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        for(char key : map.keySet()) {
            if(map.get(key) == 1) return key;
        }
        return null;
    }
}
