package com.camilo.leetcode


class TwoFurthestHoueWithDiffentColors {
    /**
     * The challenge: https://leetcode.com/problems/two-furthest-houses-with-different-colors
     * The time complexity is O(n)
     *
     */
    fun maxDistance(colors: IntArray): Int {
        var max = 0;
        val right = 0
        val rightColor = colors[right]
        val left = colors.size - 1
        val leftColor = colors[left]
        for (i in colors.indices) {
            val currenColor = colors[i]
            if (currenColor != rightColor) {
                val rightAbs = Math.abs(right - i)
                max = Math.max(max, rightAbs)
            }
            if (currenColor != leftColor) {
                val leftAbs = Math.abs(left - i)
                max = Math.max(max, leftAbs)
            }
        }
        return max
    }

}