package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DeepFirstValuesTest {

    @Test
    fun `should print a, b, d, e ,c ,f values`() {
        val expected = listOf("a", "b", "d", "e", "c", "f")
        val a = Node("a")
        val b = Node("b")
        val c = Node("c")
        val d = Node("d")
        val e = Node("e")
        val f = Node("f")
        a.left = b
        a.right = c
        b.left = d
        b.right = e
        c.right = f

        val output = DeepFirstValues().depthFirstValues(a)
        assertArrayEquals(expected.toTypedArray(), output.toTypedArray())
    }

    @Test
    fun `should print a, b, d, e ,c ,f values recursively`() {
        val expected = listOf("a", "b", "d", "e", "c", "f")
        val a = Node("a")
        val b = Node("b")
        val c = Node("c")
        val d = Node("d")
        val e = Node("e")
        val f = Node("f")
        a.left = b
        a.right = c
        b.left = d
        b.right = e
        c.right = f

        val output = DeepFirstValues().depthFirstValuesRecursively(a)
        assertArrayEquals(expected.toTypedArray(), output.toTypedArray())
    }

}