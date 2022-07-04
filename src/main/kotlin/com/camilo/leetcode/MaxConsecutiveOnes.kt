package com.camilo.leetcode

/**
 * link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
class MaxConsecutiveOnes {

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var totalConsecutive = 0
        var maxConsecutive = 0
        var temp = nums[0]
        for (index in 1 until nums.size) {
            val num = nums[index]
            if (num != temp) {
                totalConsecutive = 0
            }
            totalConsecutive++
            temp = num
            maxConsecutive = Math.max(maxConsecutive, totalConsecutive)
        }
        return maxConsecutive
    }
}