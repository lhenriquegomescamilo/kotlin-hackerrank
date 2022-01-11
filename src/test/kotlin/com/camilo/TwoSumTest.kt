package com.camilo

import com.camilo.leetcode.TwoSum
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun `it should return 1,1 to input 3,3 and target is 6`() {
        val nums = intArrayOf(3, 3)
        val twoSum = TwoSum().twoSum(nums, 6)
        assertArrayEquals(intArrayOf(0, 1), twoSum)
    }
    @Test
    fun `it should return 0,1 to input 2,7,11,15 and target is 9`() {
        val nums = intArrayOf(2,7,11,15)
        val twoSum = TwoSum().twoSum(nums, 9)
        assertArrayEquals(intArrayOf(0, 1), twoSum)
    }
}