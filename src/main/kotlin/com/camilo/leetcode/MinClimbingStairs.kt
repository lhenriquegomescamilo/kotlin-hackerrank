package com.camilo.leetcode

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 */
class MinClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {
        var step1 = 0
        var step2 = 0
        for (i in (cost.size - 1) downTo 0) {
            val currentStep = cost[i] + Math.min(step1, step2)
            step1 = step2
            step2 = currentStep
        }
        return Math.min(step1, step2)
    }
}