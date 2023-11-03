package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestConsecutiveTest {
    
    @Test
    fun `it should return longestConsecutive 4`() {
        val input = intArrayOf(100, 4, 200, 1, 3, 2)
        val output = LongestConsecutive().longestConsecutive(input)
        val expected = 4
        assertEquals(expected, output)
    }
    @Test
    fun `it should return longestConsecutive 9`() {
        val input = intArrayOf(0,3,7,2,5,8,4,6,0,1)
        val output = LongestConsecutive().longestConsecutive(input)
        val expected = 9
        assertEquals(expected, output)
    }
}