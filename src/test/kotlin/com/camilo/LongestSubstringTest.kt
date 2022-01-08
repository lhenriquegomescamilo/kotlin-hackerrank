package com.camilo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LongestSubstringTest {

    @Test
    fun `it should return a 3 to abcabcbb`() {
        val input = "abcabcbb"
        val result = LongestSubstring().lengthOfLongestSubstring(input)
        Assertions.assertEquals(3, result)
    }
    @Test
    fun `it should return a 3 to pwwkew`() {
        val input = "pwwkew"
        val result = LongestSubstring().lengthOfLongestSubstring(input)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun `it should return a 2 to cdd`() {
        val input = "cdd"
        val result = LongestSubstring().lengthOfLongestSubstring(input)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun `it should return a 2 to aaca`() {
        val input = "aaca"
        val result = LongestSubstring().lengthOfLongestSubstring(input)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun `it should return a 3 to ohomm`() {
        val input = "ohomm"
        val result = LongestSubstring().lengthOfLongestSubstring(input)
        Assertions.assertEquals(3, result)
    }
}