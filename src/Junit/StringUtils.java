package Junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(reverse(cleaned));
    }

    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) count++;
        }
        return count;
    }
}



class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void initStringUtils() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("Reverse string successfully")
    void testReverseString() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Reverse null throws IllegalArgumentException")
    void testReverseNull() {
        IllegalArgumentException exc = assertThrows(
                IllegalArgumentException.class,
                () -> stringUtils.reverse(null)
        );
        assertEquals("input cannot be null", exc.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "A man a plan a canal Panama", "12321"})
    @DisplayName("Palindrome detection for valid palindromes")
    void testPalindromeTrue(String input) {
        assertTrue(stringUtils.isPalindrome(input));
    }

    @Test
    @DisplayName("Palindrome detection for non-palindromes")
    void testPalindromeFalse() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Vowel count in string")
    void testVowelsCount() {
        assertEquals(3, stringUtils.countVowels("hello world"));
    }
}

