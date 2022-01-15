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
    fun `it should return 6 when the input is 7,2,5,8,1`() {
        val input = intArrayOf(7,2,5,8,1)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifference(input)
        assertEquals(6, result)
    }


    @Test
    fun `it should return -1 when the input is 9,4,3,2`() {
        val input = intArrayOf(9, 4, 3, 2)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifference(input)
        assertEquals(-1, result)
    }

    @Test
    fun `it should return 4 when the input is 7,1,5,4 with O(n) approach`() {
        val input = intArrayOf(7, 1, 5, 4)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifferenceMoreFaster(input)
        assertEquals(4, result)
    }

    @Test
    fun `it should return -1 when the input is 9,4,3,2 with O(n) approach`() {
        val input = intArrayOf(9, 4, 3, 2)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifferenceMoreFaster(input)
        assertEquals(-1, result)
    }
    @Test
    fun `it should return 9 when the input is 1,5,2,10 with O(n) approach`() {
        val input = intArrayOf(1,5,2,10)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifferenceMoreFaster(input)
        assertEquals(9, result)
    }


    @Test
    fun `it should return 6 when the input is 7,2,5,8,1 with O(n) approach`() {
        val input = intArrayOf(7,2,5,8,1)
        val result = MaxiumDifferenceBetweenIncreaingElements().maximumDifferenceMoreFaster(input)
        assertEquals(6, result)
    }

}