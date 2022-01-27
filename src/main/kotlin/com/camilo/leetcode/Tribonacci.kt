package com.camilo.leetcode

class Tribonacci {
    fun tribonacci(n: Int): Int {
        if(n == 1 || n == 2 ) return 1
        var t0 = 0
        var t1 = 1
        var t2 = 1
        var tn = 0
        for(i in 2 until n) {
            tn = t0 + t1 + t2
            t0 = t1
            t1 = t2
            t2 = tn
        }
        return tn
    }

}