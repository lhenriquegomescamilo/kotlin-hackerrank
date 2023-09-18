package com.camilo.leetcode


fun isAnagram(s: String, t: String): Boolean {
    val storage = IntArray(26)
    val first = 'a'

    s.forEach { storage[it - first] += 1 }
    t.forEach { storage[it - first] -= 1 }

    return storage.all { it == 0 }
}