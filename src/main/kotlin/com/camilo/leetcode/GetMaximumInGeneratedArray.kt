package com.camilo.leetcode

class GetMaximumInGeneratedArray {
    /**
     * Time: O(n)
     * Space: O(n)
     */
    fun getMaximumGenerated(n: Int): Int {
        if(n == 2 || n == 1) return 1
        if(n ==  0) return 0
        val nums = IntArray(n + 1)
        nums[0] = 0
        nums[1] = 1
        var counter = 1
        var max = 0
        for (i in 2 until n step 2) {
            val current = nums[counter]
            nums[(2 * counter)] = current
            val currentPlusNext = nums[counter] + nums[counter + 1]
            nums[(2 * counter + 1)] = currentPlusNext
            max = Math.max(max, Math.max(current, currentPlusNext))
            counter++
        }
        return max
    }
}