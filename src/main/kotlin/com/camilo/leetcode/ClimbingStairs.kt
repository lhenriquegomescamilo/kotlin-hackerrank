package com.camilo.leetcode

class ClimbingStairs {
    /**
     * https://www.youtube.com/watch?v=NFJ3m9a1oJQ
     */
    fun solve(n: Int): Int {
        var one = 1
        var two = 1
        for( i in 0 until (n - 1)){
            val temp = one
            one += two
            two = temp
        }
        return one
    }

}