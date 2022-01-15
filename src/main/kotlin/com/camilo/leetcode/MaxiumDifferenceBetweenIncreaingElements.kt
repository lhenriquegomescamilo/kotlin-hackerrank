package com.camilo.leetcode

class MaxiumDifferenceBetweenIncreaingElements {
    fun maximumDifference(nums: IntArray): Int {
        var max = -1
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                val result = nums[j] - nums[i]
                max = Math.max(max, result)
            }
        }
        return if (max <= 0) -1 else max
    }
}