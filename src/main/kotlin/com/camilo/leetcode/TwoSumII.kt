package com.camilo.leetcode

class TwoSumII {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0;
        var right = numbers.size - 1
        var result = 0
        while (left < right) {
            result = numbers[left] + numbers[right]
            if (result == target) {
                return intArrayOf(left + 1, right +1)
            }
            if (result > target) {
                right--
            } else if (result < target) {
                left++
            }
        }
        return intArrayOf()
    }
}