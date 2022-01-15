package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BestTimeToBuyAndSellStockTest {

    @Test
    fun `it should return a max 5 profit to prices array of 7,1,5,3,6,5`() {
        val input = intArrayOf(7, 1, 5, 3, 6, 5)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(5, result)
    }

    @Test
    fun `it should return a max 5 profit to prices array of 7, 1, 5, 6, 4`() {
        val input = intArrayOf(7, 1, 5, 6, 4)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(5, result)
    }

    @Test
    fun `it should return a max 0 profit to prices array of 7, 6, 4 ,3, 1`() {
        val input = intArrayOf(7, 6, 4, 3, 1)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(0, result)
    }


    @Test
    fun `it should return a max 2 profit to prices array of 2, 4, 1`() {
        val input = intArrayOf(2, 4, 1)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(2, result)
    }


    @Test
    fun `it should return a max 1 profit to prices array of 2,1,2,0,1`() {
        val input = intArrayOf(2, 1, 2, 0, 1)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(1, result)
    }

    @Test
    fun `it should return a max 4 profit to prices array of 3,2,6,5,0,3`() {
        val input = intArrayOf(3, 2, 6, 5, 0, 3)
        val result = BestTimeToBuyAndSellStock().maxProfit(input)
        assertEquals(4, result)
    }
}