package com.camilo.leetcode

import java.util.*

class PascalTriangleII {

    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) return listOf(1)
        if (rowIndex == 1) return listOf(1, 1)

        val acc = LinkedList<ArrayList<Int>>()
        for (i in 0 .. rowIndex) {
            val innerAcc = ArrayList<Int>(i)
            for (j in 0..i) {
                if (j == 0 || j == i) {
                    innerAcc.add(1)
                    continue
                }
                val lastRow = acc[i - 1]
                val sumValueAtTheLasRow = lastRow[j - 1] + lastRow[j]
                innerAcc.add(sumValueAtTheLasRow)
            }
            acc.add(innerAcc)
        }
        return acc[rowIndex]
    }
}