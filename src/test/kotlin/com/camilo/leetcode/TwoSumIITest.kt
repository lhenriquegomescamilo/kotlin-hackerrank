package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumIITest {

    @Test
    fun `it should return 1 and 2 when the target is 9`() {
        val input = intArrayOf(2, 7, 11, 15)
        val result = TwoSumII().twoSum(numbers = input, target = 9)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `it should return 3 and 4 when the target is 9`() {
        val input = intArrayOf(1, 3, 4, 5, 7, 10, 11)
        val result = TwoSumII().twoSum(numbers = input, target = 9)
        val expected = intArrayOf(3, 4)
        assertArrayEquals(expected, result)
    }
}