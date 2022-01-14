package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PascalTriangleTest {

    @Test
    fun `it should return a pascal numberer to input 5`() {
        val input = 5
        val result = PascalTriangle().generate(input)
        val expected = mutableListOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1),
        )
        assertEquals(expected, result)

    }
}