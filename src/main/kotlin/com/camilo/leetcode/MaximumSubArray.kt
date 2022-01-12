package com.camilo.leetcode

class MaximumSubArray {
    /**
     * Example: [-2,1,-3,4,-1,2,1,-5,4]
     * output is: 6
     * because the continous subarray is= 4,-1,2,1 = 6
     */
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var sum = 0

        for (i in nums.indices) {
            sum += nums[i]
            max = sum.coerceAtLeast(max)
            if(sum < 0 ) sum = 0
        }

        return max
    }
}