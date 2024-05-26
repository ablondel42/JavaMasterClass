package ControlFlow.NumberPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(NumberPalindrome.isPalindrome(-1221));
        assertTrue(NumberPalindrome.isPalindrome(707));
        assertFalse(NumberPalindrome.isPalindrome(11212));
    }
}