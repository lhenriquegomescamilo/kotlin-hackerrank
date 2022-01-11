package com.camilo.leetcode

/**
 * The problem is: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
class SumRootToLeaf {
    fun run(root: TreeNode?): Int {
        var acc = ""
        var currentNode: TreeNode? = root
        while (true) {
            acc += currentNode?.value
            acc += ';'

            if (currentNode?.left == null && currentNode?.right == null) break
            currentNode = currentNode?.left
        }
        return 0
    }
}

data class TreeNode(var value: Int, var left: TreeNode? = null, var right: TreeNode? = null)