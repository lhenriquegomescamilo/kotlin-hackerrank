package com.camilo.leetcode

class CheckIfDoubleExist {

    fun checkIfExist(arr: IntArray): Boolean {
        for (i in arr.indices) {
            val first = arr[i]
            val isEven = first % 2 == 0
            if (isEven) {
                for (j in arr.indices) {
                    val second = arr[j]
                    if(first == 2 * second && i != j){
                       return true
                   }
                }
            }
        }

        return false
    }
}