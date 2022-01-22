package com.camilo

/**
 * Exmaple:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */
class Subsequence {
    /**
     * Time: O(n)
     * Space: O(1)
     */
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            val first = s[i]
            val second = t[j]
            if (first == second) i++
            j++
        }
        return i == s.length
    }
}