package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `it should return 5 to fibonaaci(5) using the recursons`() {
        val input: Long = 5
        val result = Fibonacci().fibbonacciRecurson(input)
        assertEquals(input, result)
    }

    @Test
    fun `it should return 5 to fibonaaci(5) using the memoized solutions`() {
        val input: Long = 5
        val result = Fibonacci().fibbonacciMemoize(input)
        assertEquals(input, result)
    }
}