package com.camilo.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MinNumberTest {

  @Test
  fun `it should return a minimum number of array 10, 3, 9, 2, 1, 8, 7`(){
    val input = arrayOf(10, 3, 9, 2, 1, 8, 7)
    val minNumber = MinNumber().findMinimumNumber(input)
    Assertions.assertEquals(1, minNumber)

  }
}