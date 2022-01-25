package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinClimbingStairsTest {

    /**
     * Input: cost = [1,100,1,1,1,100,1,1,100,1]
    Output: 6
    Explanation: You will start at index 0.
    - Pay 1 and climb two steps to reach index 2.
    - Pay 1 and climb two steps to reach index 4.
    - Pay 1 and climb two steps to reach index 6.
    - Pay 1 and climb one step to reach index 7.
    - Pay 1 and climb two steps to reach index 9.
    - Pay 1 and climb one step to reach the top.
    The total cost is 6.
     */
    @Test
    fun `it should return 6 for the stairs 1,100,1,1,1,100,1,1,100,1`() {
        val input = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        val result = MinClimbingStairs().minCostClimbingStairs(input)
        assertEquals(6, result)
    }

    /**
     * Input: cost = [10,15,20]
     * Output: 15
     * Explanation: You will start at index 1.
     * - Pay 15 and climb two steps to reach the top.
     * The total cost is 15.
     */
    @Test
    fun `it should return 15 for the stairs 10,15,20`() {
        val input = intArrayOf(10,15,20)
        val result = MinClimbingStairs().minCostClimbingStairs(input)
        assertEquals(15, result)
    }
}