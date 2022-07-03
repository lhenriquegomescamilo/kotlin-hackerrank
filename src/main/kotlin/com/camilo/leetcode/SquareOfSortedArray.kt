package com.camilo.leetcode

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
     */
    fun sortedSquare(nums: IntArray): IntArray {
        var temp: Int
        for (index in nums.indices) {
            val currentNumber = nums[index]
            val currentPower = currentNumber * currentNumber
            nums[index] = currentPower;
        }

        for(index in nums.indices) {
            for(j in (index + 1) until nums.size) {
                if(nums[index] > nums[j]) {
                    temp = nums[index]
                    nums[index] = nums[j]
                    nums[j] = temp
                }
            }
        }
        return nums
    }
}