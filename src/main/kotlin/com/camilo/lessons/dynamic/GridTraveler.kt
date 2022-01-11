package com.camilo.lessons.dynamic

class GridTraveler {
    fun gridTraveler(n: Long, m: Long, memo: MutableMap<Pair<Long, Long>, Long> = mutableMapOf()): Long {
        if (n <= 1L && m <= 1) return 1
        if (n == 0L || m == 0L) return 0
        if (memo.containsKey(Pair(n, m))) return memo[Pair(n, m)]!!
        val result = gridTraveler(n - 1, m, memo) + gridTraveler(n, m - 1, memo)
        memo[Pair(n, m)] = result
        return result
    }
}