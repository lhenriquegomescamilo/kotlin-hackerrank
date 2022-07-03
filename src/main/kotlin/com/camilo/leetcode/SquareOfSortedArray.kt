package com.camilo.leetcode

import kotlin.math.abs

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 *
 */
class SquareOfSortedArray {
    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * time complexity is: O(m + n^2)
     * space complexity is: O(3 + n) -> O(n)
     */
    fun sortedSquare(nums: IntArray): IntArray {
        var temp: Int
        for (index in nums.indices) {
            val currentNumber = nums[index]
            val currentPower = currentNumber * currentNumber
            nums[index] = currentPower;
        }

        for (index in nums.indices) {
            for (j in (index + 1) until nums.size) {
                if (nums[index] > nums[j]) {
                    temp = nums[index]
                    nums[index] = nums[j]
                    nums[j] = temp
                }
            }
        }
        return nums
    }

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * time complexity is: O(n)
     * space complexity is: O(m + n)
     */
    fun sortedSquareLinear(nums: IntArray): IntArray {
        var leftIndex = 0
        var rightIndex = nums.lastIndex
        var pointer = nums.lastIndex
        val output = IntArray(nums.size)

        while (leftIndex <= rightIndex) {
            if (abs(nums[leftIndex]) > abs(nums[rightIndex])) {
                output[pointer] = nums[leftIndex] * nums[leftIndex]
                leftIndex++
            } else {
                output[pointer] = nums[rightIndex] * nums[rightIndex]
                rightIndex--
            }
            pointer--
        }
        return output
    }

}