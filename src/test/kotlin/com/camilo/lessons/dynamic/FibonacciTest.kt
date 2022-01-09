package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `it should return 5 to fibonaaci(5) using the recursions approach`() {
        val input: Long = 5
        val result = Fibonacci().fibbonacciRecursion(input)
        assertEquals(input, result)
    }

    @Test
    fun `it should return 5 to fibonaaci(5) using the memoized approach`() {
        val input: Long = 5
        val result = Fibonacci().fibbonacciMemoize(input)
        assertEquals(input, result)
    }


    @Test
    fun `it should return 5 to fibonaaci(5) using the bottom up approach`() {
        val input = 5
        val result = Fibonacci().fibonnaciBottomUp(input)
        assertEquals(input, result)
    }
}