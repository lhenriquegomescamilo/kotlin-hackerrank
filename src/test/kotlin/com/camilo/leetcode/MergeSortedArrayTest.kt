package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MergeSortedArrayTest {

    @Test
    fun `it should return 1,2,2,3,5,6 with input 1,2,3,0,0,0 and 2,5,6`() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val size1 = 3

        val nums2 = intArrayOf(2, 5, 6)
        val size2 = 3

        val output = MergeSortedArray().merge(nums1, size1, nums2, size2)

        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        assertArrayEquals(expected, output)
    }

    @Test
    fun `it should return 1,2 with input 1 and 2`() {
        val nums1 = IntArray(2)
        nums1[0] = 1
        val size1 = 1

        val nums2 = intArrayOf(2)
        val size2 = 1

        val output = MergeSortedArray().merge(nums1, size1, nums2, size2)

        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, output)
    }

    @Test
    fun `it should return 1 with input 0 and 1`() {
        val nums1 = intArrayOf(0)
        val size1 = 0

        val nums2 = intArrayOf(1)
        val size2 = nums2.size

        val output = MergeSortedArray().merge(nums1, size1, nums2, size2)

        val expected = intArrayOf(1)
        assertArrayEquals(expected, output)
    }


    @Test
    fun `it should return 1,2 with input 2 and 1`() {
        val nums1 = IntArray(2)
        nums1[0] = 2
        val size1 = 1

        val nums2 = intArrayOf(1)
        val size2 = 1

        val output = MergeSortedArray().merge(nums1, size1, nums2, size2)

        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, output)
    }
}