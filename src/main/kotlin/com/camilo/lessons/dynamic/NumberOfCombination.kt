package com.camilo.lessons.dynamic

class NumberOfCombination {
    fun howSum(targetSum: Int, numbers: List<Int>): ArrayDeque<Int>? {
        if (targetSum == 0) return ArrayDeque()
        if (targetSum < 0) return null

        for (num in numbers) {
            val remainder = targetSum - num
            val result = howSum(remainder, numbers)
            if (result != null) {
                result.addLast(num)
                return result
            }
        }
        return null
    }
}