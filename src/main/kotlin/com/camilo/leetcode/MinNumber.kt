package com.camilo.leetcode

import java.util.PriorityQueue

class MinNumber {
  fun findMinimumNumber(input: Array<Int>): Int {
    val priorityQueue = PriorityQueue<Int>(input.size)
    for (num in input) {
      priorityQueue.add(num)
    }
    return priorityQueue.peek()
  }

}