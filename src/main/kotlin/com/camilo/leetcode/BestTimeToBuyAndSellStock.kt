package com.camilo.leetcode

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxProfit = 0
        while (right < prices.size) {
            if (prices[left] < prices[right]) {
                val profit = prices[right] - prices[left]
                maxProfit = Math.max(maxProfit, profit)
            } else {
                left = right
            }
            right++
        }
        return maxProfit
    }

}