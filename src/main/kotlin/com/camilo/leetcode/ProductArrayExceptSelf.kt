package com.camilo.leetcode

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
class ProductArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = Array(nums.size) { 0 }
        val postfix = Array(nums.size) { 0 }
        val output = Array(nums.size) { 0 }


        for ((index, value) in nums.withIndex()) {
            if (index == 0) {
                prefix[index] = value
            }
            if (index > 0) {
                prefix[index] = prefix[index - 1] * value
            }

            val lastIndex = (nums.size - 1) - index

            if (lastIndex == (nums.size - 1)) {
                postfix[nums.size - 1] = nums[nums.size - 1]
            } else {
                postfix[lastIndex] = postfix[lastIndex + 1] * nums[lastIndex]
            }
        }
        for ((index, _) in nums.withIndex()) {
            val prefixValue = if (index == 0) 1 else prefix[index - 1]
            val postfixValue = if (index == nums.size - 1) 1 else postfix[index + 1]
            output[index] = postfixValue * prefixValue
        }
        return output.toIntArray()
    }
}