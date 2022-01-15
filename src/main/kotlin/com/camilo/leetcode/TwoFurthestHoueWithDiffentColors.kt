package com.camilo.leetcode

import kotlin.math.abs


class TwoFurthestHoueWithDiffentColors {
    /**
     * The time complexity is O(n)
     */
    fun maxDistance(colors: IntArray): Int {
        var max = 0
        val right = 0
        val rightColor = colors[right]
        val left = colors.size - 1
        val leftColor = colors[left]
        for (i in colors.indices) {
            val currentValue = colors[i]

            if (currentValue != rightColor) {
                max = Math.max(max, abs(right - i))
            }

            if (currentValue != leftColor) {
                max = Math.max(max, abs(left - i))
            }
        }
        return max
    }

}