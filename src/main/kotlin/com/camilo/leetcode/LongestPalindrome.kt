package com.camilo.leetcode

class LongestPalindrome {
    /**
     * Time complexity: O(n^2). Since expanding a palindrome arount its
     *      center could take O(n) time, the overrall complexity is O(n^2)
     */
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        if (s.length <= 2 && !isPalindrome(s)) return s[0].toString()
        var start = 0
        var end = 0
        for (i in s.indices) {
            val length1 = expandFromMiddle(s, i, i)
            val length2 = expandFromMiddle(s, i, i + 1)
            val length = Math.max(length1, length2)
            if (length > end - start) {
                start = i - ((length - 1) / 2)
                end = i + (length / 2)
            }
        }

        return s.substring(start, end + 1)
    }

    private fun expandFromMiddle(s: String, l: Int, r: Int): Int {
        if (s.isEmpty() || l > r) return 0
        var left = l
        var right = r
        //
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--
            right++

        }

        return right - left - 1
    }

    private fun isPalindrome(input: String): Boolean = input.reversed() == input

    /**
     * time complexity is O(n^3)
     */
    private fun bruteForce(s: String): String {
        if (s.length <= 2 && !isPalindrome(s)) return s[0].toString()

        var palindromeFound = ""
        for (i in s.indices) {
            for (j in s.length downTo i) {
                val current = s.substring(i, j)
                if (current.isEmpty()) continue
                if (isPalindrome(current) && current.length >= palindromeFound.length) {
                    palindromeFound = current
                }
            }
        }
        return palindromeFound
    }
}