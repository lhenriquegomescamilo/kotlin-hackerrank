package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AnagramKtTest {
    @Test
    fun `it should return a valid anagram `() {
        val output = isAnagram("anagram", "nagaram")
        assertTrue(output, "Is not valid anagram")

    }
}