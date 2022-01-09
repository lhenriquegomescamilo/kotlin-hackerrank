package com.camilo.lessons.dynamic

class Fibonacci {
    /**
     *                              fib(5)
     *                     fib(4)             fib(3)
     *               fib(3)     fib(2)  fib(2)    fib(1)
     *            fib(2)  fib(1)
     *
     * The time complexity is O(2^n) and some operations like fib(2) are repeated 3 times and fib(3) are repeated 2 time,
     *  they are lost computate
     */
    fun fibbonacciRecursion(n: Long): Long =
        if (n == 1L || n == 2L) 1L
        else fibbonacciRecursion(n - 1) + fibbonacciRecursion(n - 2)


    /**
     *                              fib(5)
     *                     fib(4)             fib(3)
     *               fib(3)     fib(2)  fib(2)    fib(1)
     *            fib(2)  fib(1)
     *
     * The time complexity is T(n) = #callFunction * t
     *     #callFunction = Number of call of function
     *     # t = time the take the value of value from array
     * The example:
     *      T(n) = O(2n + 1) * O(1)
     *      T(n) = O(2n + 1)
     *      T(n) = O(2n)
     */
    fun fibbonacciMemoize(n: Long, memo: MutableMap<Long, Long> = mutableMapOf()): Long {
        var result: Long = 0
        if (memo.contains(n)) {
            return memo[n]!!
        } else if (n == 1L || n == 2L) {
            result = 1L
        } else {
            result = fibbonacciMemoize(n - 1, memo) + fibbonacciMemoize(n - 2, memo)
        }

        memo[n] = result
        return result
    }

    /**
     *  The complexity of this function is: O(n)
     *   because the array bottonUp are defined once time.
     */
    fun fibonnaciBottomUp(n: Int): Int {
        if (n == 1 || n == 2) {
            return 1
        }
        val bottomUp = IntArray(n)
        bottomUp[0] = 1
        bottomUp[1] = 1

        for (i in 2 until n) {
            bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2]
        }

        return bottomUp[n - 1]
    }
}