package com.camilo

import com.camilo.leetcode.miniMaxSum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MinMaxKtTest {

    @Test
    fun `it should return 2063524951 and 2802298787 to array of 156873294 719583602 581240736 605827319 895647130`(){
        val arr = arrayOf(156873294,719583602,581240736,605827319,895647130)
        val result = miniMaxSum(arr)
        Assertions.assertEquals("2063524951 2802298787", result)
    }

    @Test
    fun `it should return 10 and 14 to array of 1 2 3 4 5`(){
        val arr = arrayOf(1,2,3,4,5)
        val result = miniMaxSum(arr)
        Assertions.assertEquals("10 14", result)
    }

    @Test
    fun `it should return 20 and 20 to array of 5 5 5 5 5`(){
        val arr = arrayOf(5,5,5,5,5)
        val result = miniMaxSum(arr)
        Assertions.assertEquals("20 20", result)
    }
}