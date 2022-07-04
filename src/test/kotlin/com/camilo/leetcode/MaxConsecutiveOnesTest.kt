package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MaxConsecutiveOnesTest {

    @Test
    fun `should return 3 when receive the array of 1,1,0,1,1,1`() {
        val input = intArrayOf(1, 1, 0, 1, 1, 1)
        val output = MaxConsecutiveOnes().findMaxConsecutiveOnes(input)
        assertEquals(3, output)
    }
    @Test
    fun `should return 2 when receive the array of 1,0,1,1,0,1`() {
        val input = intArrayOf(1,0,1,1,0,1)
        val output = MaxConsecutiveOnes().findMaxConsecutiveOnes(input)
        assertEquals(2, output)
    }
}