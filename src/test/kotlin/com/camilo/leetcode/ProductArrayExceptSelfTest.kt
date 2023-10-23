package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ProductArrayExceptSelfTest {

    @Test
    fun `it should return 24,12,8,6 for input 1,2,3,4`() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = ProductArrayExceptSelf().produceExpectedSelfLinearMemory(input)
        val expected = intArrayOf(24, 12, 8, 6)
        Assertions.assertArrayEquals(expected, output)
    }


    @Test
    fun `it should return 12,16,24,48,24 for input 4,3,2,1,2`() {
        val input = intArrayOf(4, 3, 2, 1, 2)
        val output = ProductArrayExceptSelf().productExceptSelf(input)
        val expected = intArrayOf(12, 16, 24, 48, 24)
        Assertions.assertArrayEquals(expected, output)
    }
}