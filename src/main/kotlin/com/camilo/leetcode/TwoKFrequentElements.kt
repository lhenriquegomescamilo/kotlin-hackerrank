package com.camilo.leetcode

class TwoKFrequentElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val storage: Array<IntArray> = Array(nums.size + 1) { IntArray(0) }
        val frequency = HashMap<Int, Int>()

        for (n in nums) {  // n = 3
            frequency[n] = frequency.getOrDefault(n, 0) + 1
        }

        for ((key, value) in frequency) {
            if (storage[value].isNotEmpty()) {
                storage[value] = storage[value] + intArrayOf(key)
            } else {
                storage[value] = intArrayOf(key)
            }
        }

        val output = ArrayDeque<Int>(k)

        for (i in storage.size - 1 downTo 1) {
            val values = storage[i]
            if (values.isNotEmpty()) {
                for (value in values) {
                    if (output.size == k) break
                    output.addLast(value)
                }
            }
        }

        return output.toIntArray()

    }
}