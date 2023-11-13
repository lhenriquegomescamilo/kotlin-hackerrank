package com.camilo.leetcode

class ValidPalindrome {
    fun isPalindrome(raw: String): Boolean {
        var right = raw.length - 1
        var left = 0
        while (left < right) {
            while (left < right && !isAlphaNumeric(raw[left])) {
                left++
            }
            while (right > left && !isAlphaNumeric(raw[right])) {
                right--
            }
            if (raw[left].lowercaseChar() != raw[right].lowercaseChar()) {
                return false
            }
            right--
            left++
        }
        return true
    }

    private fun isAlphaNumeric(character: Char): Boolean {
        return (character in 'A'..'Z') || (character in 'a'..'z') || (character in '0'..'9')
    }
}