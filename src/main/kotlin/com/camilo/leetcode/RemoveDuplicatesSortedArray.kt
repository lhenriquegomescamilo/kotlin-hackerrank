package com.camilo.leetcode

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
 */
class RemoveDuplicatesSortedArray {
    /**
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    fun removeDuplicates(nums: IntArray): Int {
        var left = 1
        for (right in 1 until nums.size) {
            if (nums[right - 1] != nums[right]) {
                nums[left] = nums[right]
                left++
            }
        }
        return left
    }
}