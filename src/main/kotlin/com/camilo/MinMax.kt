package com.camilo

fun miniMaxSum(arr: Array<Int>): String {
    val first = arr[0]
    var min: Long = Long.MAX_VALUE
    var max: Long = 0
    if (arr.all { it == first }) {
        var accumulator: Long = 0
        for(num in arr ) accumulator += num
        accumulator -= first
        min = accumulator
        max = accumulator
    } else {
        for (num in arr) {
            var sum: Long = 0
            for (innerNum in arr) {
                if (num != innerNum) sum += innerNum
            }
            if (sum >= max) max = sum
            if (sum <= min) min = sum
        }
    }

    return "$min $max"
}
