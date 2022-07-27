package com.camilo.leetcode

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 */
class ValidMountainArray {

    fun validMountainArray(arr: IntArray): Boolean {
        val middle = arr.lastIndex / 2
        var left = 1
        var last = arr.last()
        for (i in arr.lastIndex downTo (middle + 1)) {
            val currentNumber = arr[i]
            if (last < currentNumber) {
                left++
            }
            last = currentNumber
        }

        last = arr.first()
        var right = 1
        for (i in 0..middle) {
            val currentNumber = arr[i]
            if (last < currentNumber) {
                right++
            }
            last = currentNumber
        }

        return right + left == arr.size && arr.size > 2
    }

}