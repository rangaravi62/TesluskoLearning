package DSAPatterns.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqOfCharsInAString {
    public static void main(String[] args) {
        String str = "Ranga Ravi Teja";
        System.out.println(freqOfChars(str));
    }

    static Map<Character, Integer> freqOfChars(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') continue;;
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
}
