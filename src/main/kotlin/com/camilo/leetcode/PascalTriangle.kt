package com.camilo.leetcode

class PascalTriangle {

    /**
     * The problem is: https://leetcode.com/problems/pascals-triangle/
     */
    fun generate(numRows: Int): List<List<Int>> {
        if(numRows == 1) return mutableListOf(mutableListOf(1))
        val acc = mutableListOf<MutableList<Int>>(
            arrayListOf(1),
            arrayListOf(1, 1)
        )
        for (i in 2 until (numRows + 1)) {
            val innerAcc = arrayListOf<Int>()
            val lastList = acc[i - 1]
            for (j in 0 until i) {
                if ((j == 0 || j == (i - 1))) {
                    innerAcc.add(1)
                    continue
                }

                val beforIndex = j - 1

                val result = lastList[beforIndex] + lastList[j]
                innerAcc.add(result)

            }

            acc.add(innerAcc)
        }

        return acc.distinct()
    }
}