package com.camilo.leetcode

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 */
class RemoveElement {

    fun removeElement(nums: IntArray, value: Int): Int {
        var leftPointer = 0
        var rightPointer = nums.lastIndex
        while (leftPointer <= rightPointer) {
            if (nums[rightPointer] == value) {
                rightPointer--
            }

            if (nums[leftPointer] == value) {
                val left = nums[leftPointer]
                val right = nums[rightPointer]
                nums[rightPointer] = left
                nums[leftPointer] = right
                rightPointer--
            }
            leftPointer++
        }

        var counterElementDeleted = 0
        for (num in nums) {
            if (num == value) counterElementDeleted++
        }
        return nums.size - counterElementDeleted
    }
}