package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class CoutingbitsTest {

    @Test
    fun `it should return 0,1,1,2,1,2 a number to the input 5`() {
        val input = 5
        val result = Coutingbits().countBits(input)
        assertArrayEquals(intArrayOf(0, 1, 1, 2, 1, 2), result)
    }

    @Test
    fun `it should return 0,1,1 a number to the input 2`() {
        val input = 5
        val result = Coutingbits().countBits(input)
        assertArrayEquals(intArrayOf(0,1,1), result)
    }
}