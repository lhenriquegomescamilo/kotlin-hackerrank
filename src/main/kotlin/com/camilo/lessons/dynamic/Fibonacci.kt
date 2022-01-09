package com.camilo.lessons.dynamic

class Fibonacci {
    fun fibbonacciRecurson(n: Long): Long =
        if (n == 1L || n == 2L) 1L
        else fibbonacciRecurson(n - 1) + fibbonacciRecurson(n - 2)
}