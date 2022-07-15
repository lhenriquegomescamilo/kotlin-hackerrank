package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/duplicate-zeros/
 */
internal class DuplicateZerosTest {

    @Test
    fun `it should return duplicate zero`() {
        val input = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val output = DuplicateZeros().duplicateZeros(input)
        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
        assertArrayEquals(expected, output)
    }

    @Test
    fun `it should return duplicate zero with O(n) space complexity`() {
        val input = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
        val output = DuplicateZeros().duplicateZerosNoNewArray(input)
        val expected = intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)
        assertArrayEquals(expected, output)
    }

    @Test
    fun `it should return duplicate zero with O(n) space complexity with input 1, 5, 2, 0, 6, 8, 0, 6, 0`() {
        val input = intArrayOf(1, 5, 2, 0, 6, 8, 0, 6, 0)
        val output = DuplicateZeros().duplicateZerosNoNewArray(input)
        val expected = intArrayOf(1, 5, 2, 0, 0, 6, 8, 0, 0)
        assertArrayEquals(expected, output)
    }

}