package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReplaceElementWithGreatestElementOnRightSideTest {

    @Test
    fun `it should return array of 18,6,6,6,1,-1 to input array of 17,18,5,4,6,1`() {
        val arr = intArrayOf(17, 18, 5, 4, 6, 1)
        val result = ReplaceElementWithGreatestElementOnRightSide().replaceElements(arr)
        assertEquals(intArrayOf(18, 6, 6, 6, 1, -1), result)
    }
}