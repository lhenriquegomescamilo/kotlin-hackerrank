package com.camilo.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwoFurthestHoueWithDiffentColorsTest {

    @Test
    fun `it should return 3 when have the array of 1, 1, 1, 6, 1,1,1`() {
        val colors = intArrayOf(1, 1, 1, 6, 1, 1, 1)
        val result: Int = TwoFurthestHoueWithDiffentColors().maxDistance(colors)
        assertEquals(3, result)
    }

    @Test
    fun `it should return 3 when have the array of 1, 8, 3, 8, 3`() {
        val colors = intArrayOf(1, 8, 3, 8, 3)
        val result: Int = TwoFurthestHoueWithDiffentColors().maxDistance(colors)
        assertEquals(4, result)
    }

    @Test
    fun `it should return 3 when have the array of 0,1`() {
        val colors = intArrayOf(0, 1)
        val result: Int = TwoFurthestHoueWithDiffentColors().maxDistance(colors)
        assertEquals(1, result)
    }
    @Test
    fun `it should return 3 when have the array of 4,4,4,11,4,4,11,4,4,4,4,4`() {
        val colors = intArrayOf(4,4,4,11,4,4,11,4,4,4,4,4)
        val result: Int = TwoFurthestHoueWithDiffentColors().maxDistance(colors)
        assertEquals(8, result)
    }
}