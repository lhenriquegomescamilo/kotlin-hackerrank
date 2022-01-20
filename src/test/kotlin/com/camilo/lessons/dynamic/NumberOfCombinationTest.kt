package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class NumberOfCombinationTest {

    @Test
    fun `it should return 4,3 combination of 7 to array of 5, 3, 4, 7 - BRUTE FORCE`() {
        val input = 7
        val arr = listOf(5, 3, 4, 7)
        val result = NumberOfCombination().howSumBruteForce(input, arr)
        assertEquals(ArrayDeque(listOf(4, 3)), result)
    }

    @Test
    fun `it should return 3,2,2 combination of 7 to array of 2,3 BRUTE FORCE`() {
        val input = 7
        val arr = listOf(2, 3)
        val result = NumberOfCombination().howSumBruteForce(input, arr)
        assertEquals(ArrayDeque(listOf(3, 2, 2)), result)
    }

    @Test
    fun `it should return 2,2,2,2 combination of 8 to array of 2,3 BRUTE FORCE`() {
        val input = 8
        val arr = listOf(2, 3)
        val result = NumberOfCombination().howSumBruteForce(input, arr)
        assertEquals(ArrayDeque(listOf(2, 2, 2, 2)), result)
    }

    @Test
    fun `it should return null combination of 7 to array of 2,4 BRUTE FORCE`() {
        val input = 7
        val arr = listOf(2, 4)
        val result = NumberOfCombination().howSumBruteForce(input, arr)
        assertNull(result)
    }





    @Test
    fun `it should return 4,3 combination of 7 to array of 5, 3, 4, 7 - BRUTE FORCE Memoization`() {
        val input = 7
        val arr = listOf(5, 3, 4, 7)
        val result = NumberOfCombination().howSumBruteForceMemoization(input, arr)
        assertEquals(ArrayDeque(listOf(4, 3)), result)
    }

    @Test
    fun `it should return 3,2,2 combination of 7 to array of 2,3 BRUTE FORCE Memoization`() {
        val input = 7
        val arr = listOf(2, 3)
        val result = NumberOfCombination().howSumBruteForceMemoization(input, arr)
        assertEquals(ArrayDeque(listOf(3, 2, 2)), result)
    }

    @Test
    fun `it should return 2,2,2,2 combination of 8 to array of 2,3 BRUTE FORCE Memoization`() {
        val input = 8
        val arr = listOf(2, 3)
        val result = NumberOfCombination().howSumBruteForceMemoization(input, arr)
        assertEquals(ArrayDeque(listOf(2, 2, 2, 2)), result)
    }

    @Test
    fun `it should return null combination of 7 to array of 2,4 BRUTE FORCE Memoization`() {
        val input = 7
        val arr = listOf(2, 4)
        val result = NumberOfCombination().howSumBruteForceMemoization(input, arr)
        assertNull(result)
    }

    @Test
    fun `it should return null combination of 300 to array of 7,14 BRUTE FORCE Memoization`() {
        val input = 300
        val arr = listOf(7, 14)
        val result = NumberOfCombination().howSumBruteForceMemoization(input, arr)
        assertNull(result)
    }

}