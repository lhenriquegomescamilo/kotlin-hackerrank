package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */
internal class TribonacciTest {
    @Test
    fun `it should return 4 to output 4 `() {
        val input = 4
        val result = Tribonacci().tribonacci(input)
        assertEquals(4, result)
    }
}