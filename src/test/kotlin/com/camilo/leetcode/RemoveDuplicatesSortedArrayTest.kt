package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesSortedArrayTest {

    @Test
    fun `it should return 1,2,1 to input 1,1,2`() {
        val input = intArrayOf(1, 1, 2)
        val output = RemoveDuplicatesSortedArray().removeDuplicates(input)
        assertArrayEquals(intArrayOf(1,2,1), input)
        assertEquals(2, output)

    }
}