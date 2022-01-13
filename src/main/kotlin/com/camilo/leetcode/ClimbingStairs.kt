package com.camilo.leetcode

class ClimbingStairs {
    /**
     * https://www.youtube.com/watch?v=NFJ3m9a1oJQ
     * https://leetcode.com/problems/climbing-stairs/
     */
    fun solutionBottonUp(n: Int): Int {
        var one = 1
        var two = 1
        for (i in 0 until (n - 1)) {
            val temp = one
            one += two
            two = temp
        }
        return one
    }

    fun recursiveSolution(n: Int): Int {
        if (n < 0) return 0
        if (n == 1 || n == 0) return 1
        return recursiveSolution(n - 1) + recursiveSolution(n - 2)
    }

    fun memoizeSolution(n: Int, memo: MutableMap<Int, Int> = mutableMapOf()): Int {
        if (memo.containsKey(n)) return memo[n]!!
        if (n < 0) return 0
        if (n == 1 || n == 0) return 1
        val result = memoizeSolution(n - 1, memo) + memoizeSolution(n - 2, memo)
        memo[n] = result
        return result
    }

}