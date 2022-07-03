package com.camilo.leetcode

class FindNumbersEvenNumberDigits {
    fun findNumbers(nums: IntArray): Int {
        var numberOfEvents = 0
        for (num in nums) {
            val length = num.toString().length
            if(length % 2 == 0) {
                numberOfEvents++
            }
        }
        return numberOfEvents
    }
}