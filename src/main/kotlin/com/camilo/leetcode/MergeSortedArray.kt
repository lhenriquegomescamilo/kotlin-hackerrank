package com.camilo.leetcode

class MergeSortedArray {
    /**
     * 1,2,3,0,0,0
     * 2,5,6
     *
     * 1, 2, 2, 3, 5, 6
     *
     */
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        var firstPointer = m
        var secondPointer = n
        while (firstPointer > 0 && secondPointer > 0) {
            val endAvailablePointer = firstPointer + secondPointer - 1
            if (nums1[firstPointer - 1] > nums2[secondPointer - 1]) {
                nums1[endAvailablePointer] = nums1[firstPointer - 1]
                firstPointer--
            } else {
                nums1[endAvailablePointer] = nums2[secondPointer - 1]
                secondPointer--
            }
        }
        while (secondPointer > 0) {
            nums1[firstPointer + secondPointer - 1] = nums2[secondPointer - 1]
            secondPointer--
        }
        return nums1
    }
}