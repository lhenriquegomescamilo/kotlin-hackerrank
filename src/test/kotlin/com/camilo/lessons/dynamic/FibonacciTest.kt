package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FibonacciTest {

    @Test
    fun `it should return 5 to fibonaaci(5)`() {
        val input: Long = 5
        val result = Fibonacci().fibbonacciRecurson(input)
        assertEquals(input, result)
    }
}