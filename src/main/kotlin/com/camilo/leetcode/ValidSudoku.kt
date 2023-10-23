package com.camilo.leetcode

class ValidSudoku {
    fun isValidSudoku(inputArray: Array<CharArray>): Boolean {
        val lastIndex = inputArray.size - 1
        for (i in 0..lastIndex) {
            val sortedCharArray = inputArray[i].sortedArray()
            var previous = sortedCharArray.first()
            for (j in 1..sortedCharArray.lastIndex) {
                if (sortedCharArray[j] != '.' && sortedCharArray[j] == previous) {
                    return false
                }
                previous = sortedCharArray[j]
            }
        }

        for (i in 0..lastIndex) {
            val temp = HashSet<Char>(inputArray.size)
            for (j in 0..lastIndex) {

                if (temp.contains(inputArray[j][i])) {
                    return false
                }

                if (inputArray[j][i] != '.') {
                    temp += inputArray[j][i]
                }
            }
        }

        val boundaries = listOf(
            Pair(0, 0),
            Pair(0, 3),
            Pair(0, 6),

            Pair(3, 0),
            Pair(3, 3),
            Pair(3, 6),

            Pair(6, 0),
            Pair(6, 3),
            Pair(6, 6),
        )
        val temp = HashSet<Char>(inputArray.size)
        for (point in boundaries) {
            val (x, y) = point
            val endRow = x + 3
            val endCol = y + 3
            for (i in x until endRow) {
                for (j in y until endCol) {
                    if (temp.contains(inputArray[i][j])) {
                        return false
                    }
                    if (inputArray[i][j] != '.') {
                        temp += inputArray[i][j]
                    }
                }
            }
            temp.clear()
        }

        return true
    }

}