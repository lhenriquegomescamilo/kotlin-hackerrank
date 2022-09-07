package com.camilo.leetcode

data class Node(val value: String, var left: Node? = null, var right: Node? = null)

class DeepFirstValues {
    fun depthFirstValues(root: Node): List<String> {
        val stack = ArrayDeque<Node>().also { it.addLast(root) }
        val output = mutableListOf<String>()
        while (stack.size > 0) {
            val current = stack.removeLast()
            output.add(current.value)
            if (current.right != null) stack.addLast(current.right!!)
            if (current.left != null) stack.addLast(current.left!!)
        }

        return output
    }

    fun depthFirstValuesRecursively(root: Node?): List<String> {
        if (root === null) return mutableListOf()
        val leftValues = depthFirstValuesRecursively(root.left) // [b, d, e]
        val rightValues = depthFirstValuesRecursively(root.right) // [c, f]
        val output = mutableListOf<String>()
        return output.also { it.add(root.value) }.also { it.addAll(leftValues) }.also { it.addAll(rightValues) }
    }

}
