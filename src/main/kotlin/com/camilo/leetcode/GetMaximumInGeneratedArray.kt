package com.camilo.leetcode

class GetMaximumInGeneratedArray {
    fun getMaximumGenerated(n: Int): Int {
        if(n == 2 || n == 1) return 1
        if(n ==  0) return 0
        val nums = IntArray(n + 1)
        nums[0] = 0
        nums[1] = 1
        var counter = 1
        var max = 0
        for (i in 2 until n step 2) {
            val last = nums[counter]
            nums[(2 * counter)] = last
            val next = nums[counter] + nums[counter + 1]
            nums[(2 * counter + 1)] = next
            max = Math.max(max, Math.max(last, next))
            counter++
        }
        return max
    }
}