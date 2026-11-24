package DSAPatterns.Strings;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public static void main(String[] args) {
        List<String> input = List.of("hello world", "data structures");
        String encodedString  = encode(input);
        System.out.println(encodedString);
        System.out.println(decode(encodedString));

    }

    static String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for (String str : strs) {
            encodedStr.append(str.length()).append('#').append(str);
        }
        return new String(encodedStr);
    }

    static List<String> decode(String encodedStr) {
        int len = encodedStr.length();
        List<String> decodedList = new ArrayList<>();
        int currentIndex = 0;
        int delimeterIndex = 0;
       while (currentIndex < len) {
           delimeterIndex = currentIndex;
            while (encodedStr.charAt(delimeterIndex) != '#') {
                delimeterIndex++;
            }
            int wordLen = Integer.parseInt(encodedStr.substring(currentIndex,delimeterIndex));
            decodedList.add(encodedStr.substring(delimeterIndex+1, delimeterIndex+1+wordLen));
            currentIndex = delimeterIndex+1+wordLen;
        }
        return decodedList;
    }
}
