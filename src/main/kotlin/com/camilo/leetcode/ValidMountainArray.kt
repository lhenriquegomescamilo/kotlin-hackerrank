package com.camilo.leetcode

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 */
class ValidMountainArray {

    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size <= 2) return false

        var leftIndex = 0
        var timesDown = 0
        var isUp = false
        for (i in 1..arr.lastIndex) {
            isUp = arr[leftIndex] < arr[i]
            if (!isUp) {
                timesDown++
            }

            if ((timesDown > 0 && isUp ) || arr[leftIndex] == arr[i]) return false
            leftIndex++
        }

        return !isUp && timesDown > 0 && timesDown != (arr.size - 1)
    }

}