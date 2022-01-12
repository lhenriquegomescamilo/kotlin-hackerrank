package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximumSubArrayTest{

    @Test
    fun `it should return 6 to input -2,1,-3,4,-1,2,1,-5,4`() {
        val input = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        val result = MaximumSubArray().maxSubArray(input)
        assertEquals(6, result)
    }

    @Test
    fun `it should return 6 to input 5,4,-1,7,8`() {
        val input = intArrayOf(5,4,-1,7,8)
        val result = MaximumSubArray().maxSubArray(input)
        assertEquals(23, result)
    }

    @Test
    fun `it should return -1 to input -1`() {
        val input = intArrayOf(-1)
        val result = MaximumSubArray().maxSubArray(input)
        assertEquals(-1, result)
    }

    @Test
    fun `it should return -1 to input -2,-1`() {
        val input = intArrayOf(-2,-1)
        val result = MaximumSubArray().maxSubArray(input)
        assertEquals(-1, result)
    }

    @Test
    fun `it should return -1 to input ,-1 -2`() {
        val input = intArrayOf(-1, -2)
        val result = MaximumSubArray().maxSubArray(input)
        assertEquals(-1, result)
    }
}