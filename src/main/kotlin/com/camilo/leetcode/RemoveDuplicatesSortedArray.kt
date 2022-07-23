package com.camilo.leetcode

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
 */
class RemoveDuplicatesSortedArray {
    /**
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    fun removeDuplicates(nums: IntArray): Int {
        var storeLastNumber = -1
        var counter = 1
        for (index in nums.indices) {

            if (nums[index] == storeLastNumber && index + 1 < nums.size) {
                val nextNumber = nums[index + 1]
                val currentNumber = nums[index]
                nums[index] = nextNumber
                nums[index + 1] = currentNumber

            }
            storeLastNumber = nums[index]
            if (index > 0 && nums[index - 1] <= nums[index]) counter++


        }

        return counter
    }
}