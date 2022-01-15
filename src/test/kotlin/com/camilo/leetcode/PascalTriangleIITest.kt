package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PascalTriangleIITest {

    @Test
    fun `it should return a listOf(1,3,3,1) that represent the row index 3`() {
        val rowIndex = 3
        val row = PascalTriangleII().getRow(rowIndex)
        assertEquals(listOf(1, 3, 3, 1), row)
    }

    @Test
    fun `it should return a listOf(1) that represent the row index 0`() {
        val rowIndex = 0
        val row = PascalTriangleII().getRow(rowIndex)
        assertEquals(listOf(1), row)
    }

    @Test
    fun `it should return a listOf(1,1) that represent the row index 0`() {
        val rowIndex = 0
        val row = PascalTriangleII().getRow(rowIndex)
        assertEquals(listOf(1), row)
    }
}