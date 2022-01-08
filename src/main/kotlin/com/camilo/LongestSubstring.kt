package com.camilo

class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        var firstPointer = 0
        var secondPointer = 0
        var max = 0
        val builder = HashSet<Char>()

        while (secondPointer < s.length) {
            if (!builder.contains(s[secondPointer])) {
                builder.add(s[secondPointer])
                secondPointer++
                max = builder.size.coerceAtLeast(max)
            } else {
                builder.remove(s[firstPointer])
                firstPointer++
            }
        }
        return max
    }
}
