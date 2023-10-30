package com.camilo.leetcode

class ValidSudoku {
    fun isValidSudoku(inputArray: Array<CharArray>): Boolean {
        for (col in 0..inputArray.lastIndex) {
            val cols = mutableSetOf<Char>()
            val rows = mutableSetOf<Char>()
            val cube = mutableSetOf<Char>()

            for (row in 0..inputArray.lastIndex) {
                val c = inputArray[col][row]
                val r = inputArray[row][col]

                if (c != '.' && !cols.add(c)) return false
                if (r != '.' && !rows.add(r)) return false

                val cubeColIndex = 3 * (col % 3) + row % 3
                val cubeRowIndex = 3 * (col / 3) + row / 3

                val cubeRow = inputArray[cubeColIndex][cubeRowIndex]

                if (cubeRow != '.' && !cube.add(cubeRow)) return false

            }
        }
        return true
    }

}