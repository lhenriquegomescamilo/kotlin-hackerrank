package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoKFrequentElementsTest {

    @Test
    fun `it should return k most frequent elements`() {
        val (nums, k) = Pair(intArrayOf(1,1,1,2,2,3), 2)
        val output = TwoKFrequentElements().topKFrequent(nums, k)
        assertArrayEquals(intArrayOf(1, 2), output);
    }
}