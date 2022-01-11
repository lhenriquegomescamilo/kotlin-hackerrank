package com.camilo.leetcode

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstIndex = 0
        var secondIndex = 0
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                val result = nums[i] + nums[j]
                if (result == target) {
                    firstIndex = i
                    secondIndex = j
                }
            }
        }
        return intArrayOf(firstIndex, secondIndex)
    }
}