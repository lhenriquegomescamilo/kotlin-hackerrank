package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ValidMountainArrayTest {

    @Test
    fun `it should return true to input 0,3,2,1`() {
        val input = intArrayOf(0, 3, 2, 1)
        val result = ValidMountainArray().validMountainArray(input)
        assertTrue(result)
    }


    @Test
    fun `it should return true to input 0,1,2,4,2,1`() {
        val input = intArrayOf(0, 1, 2, 4, 2, 1)
        val result = ValidMountainArray().validMountainArray(input)
        assertTrue(result)
    }

    @Test
    fun `it should return false to input 2,1`() {
        val input = intArrayOf(2, 1)
        val result = ValidMountainArray().validMountainArray(input)
        assertFalse(result)
    }

    @Test
    fun `it should return false to input 3,5,5`() {
        val input = intArrayOf(3, 5, 5)
        val result = ValidMountainArray().validMountainArray(input)
        assertFalse(result)
    }

    @Test
    fun `it should return false to input 1,3,2`() {
        val input = intArrayOf(1, 3, 2)
        val result = ValidMountainArray().validMountainArray(input)
        assertTrue(result)
    }

    @Test
    fun `it should return false to input 1,3,2,2`() {
        val input = intArrayOf(1, 3, 2, 2)
        val result = ValidMountainArray().validMountainArray(input)
        assertFalse(result)
    }
    @Test
    fun `it should return false to input 9,8,7,6,5,4,3,2,1,0`() {
        val input = intArrayOf(9,8,7,6,5,4,3,2,1,0)
        val result = ValidMountainArray().validMountainArray(input)
        assertFalse(result)
    }
    @Test
    fun `it should return false to input 4,4,3,2,1`() {
        val input = intArrayOf(4,4,3,2,1)
        val result = ValidMountainArray().validMountainArray(input)
        assertFalse(result)
    }
}