package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LogarithmicTest {

    @Test
    fun `it should return 3 to input logarithmic of 8 using the recursion`() {
        val n: Long = 8
        val result = Logarithmic().logarithmicRecursionsOf(n)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 3 to logarithmic of 8 using the loop`() {
        val n: Long = 8
        val result = Logarithmic().logarithmicForLoopOf(n)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 4 to logarithmic of 16 using the loop`() {
        val n: Long = 16
        val result = Logarithmic().logarithmicForLoopOf(n)
        assertEquals(4, result)
    }

    @Test
    fun `it should return 2 to logarithmic of 100 using the loop`() {
        val n: Long = 100
        val result = Logarithmic().logarithmicForLoopOf(n)
        assertEquals(2, result)
    }


    @Test
    fun `it should return 2 to input logarithmic of 100 using the recursion`() {
        val n: Long = 100
        val result = Logarithmic().logarithmicRecursionsOf(n)
        assertEquals(2, result)
    }

}