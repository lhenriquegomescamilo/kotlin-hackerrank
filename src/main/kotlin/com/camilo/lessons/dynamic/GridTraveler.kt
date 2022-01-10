package com.camilo.lessons.dynamic

class GridTraveler {
    fun gridTraveler(n: Long, m: Long, incrementer: Long = 0): Long {
        if (n <= 1L && m <= 1) return incrementer
        return if (m == 1L) gridTraveler(n - 1L, m, incrementer + 1L)
        else gridTraveler(n, m - 1, incrementer + 1L)
    }
}