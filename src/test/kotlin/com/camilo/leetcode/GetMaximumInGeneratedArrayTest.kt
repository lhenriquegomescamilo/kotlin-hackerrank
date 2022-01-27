package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GetMaximumInGeneratedArrayTest {

    /**
     * Input: n = 7
     *  Output: 3
     *  Explanation: According to the given rules:
     *      nums[0] = 0
     *      nums[1] = 1
     *      nums[(1 * 2) = 2] = nums[1] = 1
     *      nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
     *      nums[(2 * 2) = 4] = nums[2] = 1
     *      nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
     *      nums[(3 * 2) = 6] = nums[3] = 2
     *      nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
     *  Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.
     */
    @Test
    fun `it should return 3 to input 7 in the maximum generated array`(){
        val input = 7
        val result = GetMaximumInGeneratedArray().getMaximumGenerated(input)
        assertEquals(3, result)

    }

    @Test
    fun `it should return 5 to input 15 in the maximum generated array`(){
        val input = 15
        val result = GetMaximumInGeneratedArray().getMaximumGenerated(input)
        assertEquals(5, result)

    }

}