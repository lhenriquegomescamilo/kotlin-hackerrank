package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GridTravelerTest {

    @Test
    fun `the travel shold walk 4 step to grid 3,3 `() {
        val result = GridTraveler().gridTraveler(3, 3)
        assertEquals(4, result)
    }
}