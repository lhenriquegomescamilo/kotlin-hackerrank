package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SumRootToLeafTest {

    @Test
    fun `it should return 22 to input as binary 1,0,1,0,1,0,1`() {
        val tree = TreeNode(
            value = 1,
            left = TreeNode(value = 0, left = TreeNode(value = 0), right = TreeNode(value = 1)),
            right = TreeNode(value = 1, left = TreeNode(value = 0), right = TreeNode(value = 1))
        )
        val result = SumRootToLeaf().run(root = tree)
        assertEquals(22, result)
    }
}