package com.camilo.leetcode


class DuplicateZeros {

    /**
     * Duplicating number using the new array,
     * Time Complexity: O(n)
     * Space Complexity: O(2n) where
     */
    fun duplicateZeros(arr: IntArray): IntArray {
        val output = IntArray(arr.size)
        var pointer = 0
        for (item in arr) {
            if (pointer == arr.size) break
            if (item == 0) {
                output[pointer] = 0
                pointer++
                output[pointer] = 0
            } else {
                output[pointer] = item
            }
            pointer++
        }
        return output
    }

    /**
     * Duplicating number using the name space,
     * Time Complexity: O(n ^ 2)
     * Space Complexity: O(n)
     */
    fun duplicateZerosNoNewArray(arr: IntArray): IntArray {
        var pointer: Int
        for (i in arr.lastIndex downTo 0) {
            if (arr[i] == 0 && i < arr.lastIndex - 1) {
                var temp = arr[i + 1]
                arr[i + 1] = 0
                pointer = i + 2
                while (pointer < arr.size) {
                    val aux = arr[pointer]
                    arr[pointer] = temp
                    pointer++
                    temp = aux
                }

            }
        }
        return arr
    }
}