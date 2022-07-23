package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class CheckIfDoubleExistTest {

    @Test
    fun `it should return true with input 10,2,5,3`() {
        val input = intArrayOf(10, 2, 5, 3)
        val result = CheckIfDoubleExist().checkIfExist(input)
        assertTrue(result)
    }

    @Test
    fun `it should return false with input -16,-13,8`() {
        val input = intArrayOf(-16, -13, 8)
        val result = CheckIfDoubleExist().checkIfExist(input)
        assertFalse(result)
    }

    @Test
    fun `it should return true with input 7,1,14,11`() {
        val input = intArrayOf(7, 1, 14, 11)
        val result = CheckIfDoubleExist().checkIfExist(input)
        assertTrue(result)
    }

    @Test
    fun `it should return false with input 9,-2,-19,15,-14,20,-2`() {
        val input = intArrayOf(9, -2, -19, 15, -14, 20, -2)
        val result = CheckIfDoubleExist().checkIfExist(input)
        assertFalse(result)
    }

    @Test
    fun `it should return false with input -2,0,10,-19,4,6,-8`() {
        val input = intArrayOf(-2,0,10,-19,4,6,-8)
        val result = CheckIfDoubleExist().checkIfExist(input)
        assertFalse(result)
    }
}