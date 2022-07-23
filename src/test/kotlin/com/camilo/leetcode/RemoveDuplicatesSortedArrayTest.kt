package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesSortedArrayTest {

    @Test
    fun `it should return 1,2,1 to input 1,1,2`() {
        val input = intArrayOf(1, 1, 2)
        val output = RemoveDuplicatesSortedArray().removeDuplicates(input)
        assertArrayEquals(intArrayOf(1, 2, 1), input)
        assertEquals(2, output)

    }

    @Test
    fun `it should return 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 to input 0,0,1,1,1,2,2,3,3,4`() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val output = RemoveDuplicatesSortedArray().removeDuplicates(input)
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4, 2, 2, 3, 3, 4), input)
        assertEquals(5, output)

    }
}