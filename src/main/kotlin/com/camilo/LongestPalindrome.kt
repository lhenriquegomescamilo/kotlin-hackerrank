package com.camilo

class LongestPalindrome {
    fun longestPalindrome(s: String): String {
        if (s.length <= 2 && !isPalindrome(s)) return s[0].toString()

        var palindromeFounded = ""
        for (i in s.indices) {
            for (j in s.length downTo i) {
                val current = s.substring(i, j)
                if(current.isEmpty()) continue
                if (isPalindrome(current) && current.length >= palindromeFounded.length) {
                    palindromeFounded = current
                }
            }
        }
        return palindromeFounded
    }

    private fun isPalindrome(input: String): Boolean = input.reversed() == input
}