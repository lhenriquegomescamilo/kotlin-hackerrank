package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveElementTest {

    @Test
    fun `it should return 3 with input 2,2,3,3`() {
        val input = intArrayOf(3, 2, 2, 3)
        val valueToRemove = 3
        val output = RemoveElement().removeElement(input, valueToRemove)
        assertArrayEquals(intArrayOf(2, 2, 3, 3), input)
        assertEquals(2, output)
    }

    @Test
    fun `it should return 2 with input 0,1,2,2,3,0,4,2`() {
        val input = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val valueToRemove = 2
        val output = RemoveElement().removeElement(input, valueToRemove)
        assertArrayEquals(intArrayOf(0, 1, 4, 0, 3, 2, 2, 2), input)
        assertEquals(5, output)
    }
}