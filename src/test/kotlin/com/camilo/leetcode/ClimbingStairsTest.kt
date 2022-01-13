package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ClimbingStairsTest {

    @Test
    fun `it should return 3 step to input 3`() {
        val input = 3
        val result = ClimbingStairs().solve(input)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 5 step to input 4`() {
        val input = 4
        val result = ClimbingStairs().solve(input)
        assertEquals(5, result)
    }
}