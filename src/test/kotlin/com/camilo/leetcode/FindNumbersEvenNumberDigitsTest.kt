package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindNumbersEvenNumberDigitsTest {

    @Test
    fun `should return 2 when the input is 12,345,2,6,7896`() {
        val input = intArrayOf(12, 345, 2, 6, 7896)
        val result = FindNumbersEvenNumberDigits().findNumbers(input)
        Assertions.assertEquals(2, result)
    }
}