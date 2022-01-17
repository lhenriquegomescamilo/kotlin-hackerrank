package com.camilo.leetcode

class Coutingbits {

    fun countBits(n: Int): IntArray {
        // Space completixy is O(n)
        val output = IntArray(n + 1)

        // Time complexity if O(n^2) because the count it's an inside loop
        for(i in 0 until n + 1) {
            val currentNumber = i.toString(radix = 2).count { it == '1' }
            output[i] = currentNumber.toInt()
        }
        return output
    }
}