package com.camilo.lessons.dynamic

class Logarithmic {
    /**
     * For this example take a look in the O(log n) expression, take a look at these steps:
     * Let use the n = 8
     *  1. O(log n)
     *  2. log 8 = x
     *  3. 2^x = 8
     *  4. x = 2*2*2
     *  5. 2*2*2 it's a number of interactions, it's mean that is = 3
     *  6. 2^3=8 or O(log 8) = 3
     *  Time time complixty it's O(log 8) because the functions has 3 interactions
     *
     */
    fun logarithmicRecursionsOf(n: Long, incrementer: Long = 0): Long {
        if (n <= 1L) return incrementer

        if ((n % 2) == 0L) return logarithmicRecursionsOf(n / 2, incrementer + 1)

        return logarithmicRecursionsOf(1, incrementer)
    }

    fun logarithmicForLoopOf(n: Long): Long {
        var interactions: Long = 0
        var counter = n
        while (counter % 2 == 0L) {
            counter /= 2
            interactions++
        }
        return interactions

    }

    fun nLogN(n: Long): Long {
        var interactions: Long = 0
        var currentCounter = n
        while(currentCounter > 1) {
            currentCounter /= 2
            var counter = n
            while((counter % 2) == 0L){
                interactions++
                counter /= 2
            }
            currentCounter--


        }
        return interactions

    }
}