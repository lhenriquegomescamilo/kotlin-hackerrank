package com.camilo.leetcode

class MaxiumDifferenceBetweenIncreaingElements {
    /**
     * The complexity time is O(n * n) or O(n^2)
     */
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

    /**
     * The complexity time is O(n)
     */
    fun maximumDifferenceMoreFaster(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for(i in nums.indices){
            min = Math.min(min, nums[i])
            val diff = nums[i] - min
            max = Math.max(diff, max)
        }
        return if(max == 0) -1 else max
    }
}