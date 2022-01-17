package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ReplaceElementWithGreatestElementOnRightSideTest {

    @Test
    fun `it should return array of 18,6,6,6,1,-1 to input array of 17,18,5,4,6,1`() {
        val arr = intArrayOf(17, 18, 5, 4, 6, 1)
        val result = ReplaceElementWithGreatestElementOnRightSide().replaceElements(arr)
        Assertions.assertArrayEquals(intArrayOf(18, 6, 6, 6, 1, -1), result)
    }

    @Test
    fun `it should return array of 56903,18666,60499,57517,26961 to input array of 60499,60499,57517,26961,-1`() {
        val arr = intArrayOf(56903, 18666, 60499, 57517, 26961)
        val result = ReplaceElementWithGreatestElementOnRightSide().replaceElements(arr)
        Assertions.assertArrayEquals(intArrayOf(60499, 60499, 57517, 26961, -1), result)
    }
}