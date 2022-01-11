package com.camilo.leetcode

/**
 * The problem is: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
class SumRootToLeaf {
    fun run(root: TreeNode?): Int = collect(root)

    private fun collect(root: TreeNode?): Int {
        var rootToLeaf = 0
        var currentNumber = 0
        var rootNode = root
        val stack = ArrayDeque<Pair<TreeNode?, Int>>()
        stack.addFirst(Pair(root, 0))
        while (stack.isNotEmpty()) {
            val (key, value) = stack.removeLast()
            rootNode = key
            currentNumber = value

            if (rootNode != null) {
                currentNumber = (currentNumber shl 1) or rootNode!!.value

                if (rootNode.left == null && rootNode.right == null) {
                    rootToLeaf += currentNumber
                } else {
                    stack.addFirst(Pair(rootNode.right, currentNumber))
                    stack.addFirst(Pair(rootNode.left, currentNumber))
                }
            }
        }

        return rootToLeaf
    }
}

data class TreeNode(var value: Int, var left: TreeNode? = null, var right: TreeNode? = null)