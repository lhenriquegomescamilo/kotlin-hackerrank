package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ClimbingStairsTest {

    @Test
    fun `it should return 3 step to input 3 bottom up`() {
        val input = 3
        val result = ClimbingStairs().solutionBottonUp(input)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 5 step to input 4 bottom up`() {
        val input = 4
        val result = ClimbingStairs().solutionBottonUp(input)
        assertEquals(5, result)
    }

    @Test
    fun `it should return 3 step to input 3 recursive solution`() {
        val input = 3
        val result = ClimbingStairs().recursiveSolution(input)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 5 step to input 4 recursive`() {
        val input = 4
        val result = ClimbingStairs().recursiveSolution(input)
        assertEquals(5, result)
    }

    @Test
    fun `it should return 3 step to input 3 memoize solution`() {
        val input = 3
        val result = ClimbingStairs().memoizeSolution(input)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 5 step to input 4 memoizeSolution`() {
        val input = 4
        val result = ClimbingStairs().memoizeSolution(input)
        assertEquals(5, result)
    }
}