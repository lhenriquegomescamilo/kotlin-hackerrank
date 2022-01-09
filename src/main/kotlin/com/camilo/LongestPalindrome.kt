package com.camilo

class LongestPalindrome {
    fun longestPalindrome(s: String): String {
        if (s.length <= 2 && !isPalindrome(s)) return s[0].toString()
        if (s.length <= 2 && isPalindrome(s)) return s


        var palindromeFounded = ""
        for (i in s.length downTo 0) {
            for (j in 0 until s.length) {
                val current = s.substring(j, i)
                if (isPalindrome(current) && current.length > 1) {
                    palindromeFounded = current
                    break
                }
            }
            if(palindromeFounded.isNotEmpty()) break
        }
        return palindromeFounded
    }

    private fun isPalindrome(input: String): Boolean = input.reversed() == input
}