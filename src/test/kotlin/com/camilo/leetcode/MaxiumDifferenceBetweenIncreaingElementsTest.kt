package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaxiumDifferenceBetweenIncreaingElementsTest {
    @Test
    fun `it should return 4 when the input is 7,1,5,4`() {
        val input = intArrayOf(7, 1, 5, 4)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifference(input)
        assertEquals(4, result)
    }

    @Test
    fun `it should return -1 when the input is 9,4,3,2`() {
        val input = intArrayOf(9, 4, 3, 2)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifference(input)
        assertEquals(-1, result)
    }
}