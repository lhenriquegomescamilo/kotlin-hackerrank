package com.camilo.leetcode

/**
 * https://leetcode.com/problems/counting-bits/
 */
class Coutingbits {

    fun countBits(n: Int): IntArray {
        // Space completixy is O(n)
        val output = IntArray(n + 1)

        // Time complexity if O(n^2) because the count it's an inside loop
        for(i in 0 until n + 1) {
            val currentNumber = i.toString(radix = 2).count { it == '1' }
            output[i] = currentNumber
        }
        return output
    }

    /**
     * Inspired by https://leetcode.com/problems/counting-bits/discuss/1683356/C%2B%2B-or-Two-Solutions
     */
    fun countBitsMoreDynamicProgramming(n: Int): IntArray {
        // Space completixy is O(n)
        val output = IntArray(n + 1)

        // Time complexity if O(n)
        for(i in 0 until n + 1) {
            output[i] = output[i shr 1] + i % 2

        }
        return output
    }
}