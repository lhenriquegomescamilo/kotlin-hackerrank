package com.camilo.leetcode

import kotlin.math.abs


class TwoFurthestHoueWithDiffentColors {
    /**
     * The time complexity is O(n)
     */
    fun maxDistance(colors: IntArray): Int {
        var max = 0
        val startPointer = 0
        val endPointer = colors.size - 1
        for (i in colors.indices) {
            val currentValue = colors[i]
            val startPointerColor = colors[startPointer]
            if (currentValue != startPointerColor) {
                max = Math.max(max, abs(startPointer - i))
            }
            val endPointerColor = colors[endPointer]
            if (currentValue != endPointerColor) {
                max = Math.max(max, abs(endPointer - i))
            }
        }
        return max
    }

}