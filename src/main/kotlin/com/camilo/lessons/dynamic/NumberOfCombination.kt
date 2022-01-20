package com.camilo.lessons.dynamic

class NumberOfCombination {
    /**
     * m = targetSum
     * n = numbers.length
     *
     * ## Bruter force
     * time: O(n^m * m)
     * space: O(n)
     */
    fun howSumBruteForce(targetSum: Int, numbers: List<Int>): ArrayDeque<Int>? {
        if (targetSum == 0) return ArrayDeque()
        if (targetSum < 0) return null

        for (num in numbers) {
            val remainder = targetSum - num
            val result = howSumBruteForce(remainder, numbers)
            if (result != null) {
                result.addLast(num)
                return result
            }
        }
        return null
    }

    /**
     * m = targetSum
     * n = numbers.length
     *
     * ## Memoized
     * time: O(n * m^2)
     * space: O(m^2)
     */
    fun howSumBruteForceMemoization(
        targetSum: Int,
        numbers: List<Int>,
        memoization: MutableMap<Int, ArrayDeque<Int>?> = LinkedHashMap()
    ): ArrayDeque<Int>? {
        if (memoization.containsKey(targetSum)) return memoization[targetSum]
        if (targetSum == 0) return ArrayDeque()
        if (targetSum < 0) return null

        for (num in numbers) {
            val remainder = targetSum - num
            val result = howSumBruteForceMemoization(remainder, numbers, memoization)
            if (result != null) {
                result.addLast(num)
                memoization[targetSum] = result
                return memoization[targetSum]
            }
        }
        memoization[targetSum] = null
        return memoization[targetSum]
    }
}