package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class SquareOfSortedArrayTest {

    @Test
    fun `should return array of 0,1,9,16,100 to input array of -4,-1,0,3,10`() {
        val inputArray = intArrayOf(-4, -1, 0, 3, 10)
        val sortedSquare = SquareOfSortedArray().sortedSquare(inputArray)
        println(sortedSquare.contentToString())
        Assertions.assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquare)
    }

    @Test
    fun `should return array of 0,1,9,16,100 to input array of -4,-1,0,3,10 linear algorithm`() {
        val inputArray = intArrayOf(-4, -1, 0, 3, 10)
        val sortedSquare = SquareOfSortedArray().sortedSquareLinear(inputArray)
        println(sortedSquare.contentToString())
        Assertions.assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquare)
    }
}