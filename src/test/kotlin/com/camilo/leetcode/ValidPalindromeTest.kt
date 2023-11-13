package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidPalindromeTest {
    @Test
    fun `the phrase A man a plan a canal Panama should be a palindrome`() {
        val input = "A man, a plan, a canal: Panama"
        val output = ValidPalindrome().isPalindrome(input)
        Assertions.assertTrue(output)
    }

    @Test
    fun `the phrase 0P should not be a palindrome`() {
        val input = "0P"
        val output = ValidPalindrome().isPalindrome(input)
        Assertions.assertFalse(output)
    }

    @Test
    fun `the empty string should be a valid palindrome`() {
        val input = " "
        val output = ValidPalindrome().isPalindrome(input)
        Assertions.assertTrue(output)
    }
}