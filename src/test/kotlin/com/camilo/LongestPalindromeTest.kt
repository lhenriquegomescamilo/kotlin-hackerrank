package com.camilo


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestPalindromeTest {

    @Test
    fun `it should return aba when the input is aba or bab`() {
        val input = "babad"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertTrue(result == "aba" || result == "bab")
    }

    @Test
    fun `it should return bb when the input is cbbd`() {
        val input = "cbbd"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("bb", result)
    }

    @Test
    fun `it should return a when the input is ac`() {
        val input = "ac"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("a", result)
    }

    @Test
    fun `it should return bb when the input is bb`() {
        val input = "bb"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("bb", result)
    }

    @Test
    fun `it should return bb when the input is abb`() {
        val input = "abb"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("bb", result)
    }

    @Test
    fun `it should return aca when the input is aacabdkacaa`() {
        val input = "aacabdkacaa"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("aca", result)
    }

    @Test
    fun `it should return bab when the input is bacabab`() {
        val input = "bacabab"
        val result = LongestPalindrome().longestPalindrome(input)
        Assertions.assertEquals("bacab", result)
    }
}