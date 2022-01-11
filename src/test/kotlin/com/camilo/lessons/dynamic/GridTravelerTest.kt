package com.camilo.lessons.dynamic

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.DisplayName::class)
internal class GridTravelerTest {

    @Test
    fun `the travel should walk 6 step to grid 3,3 `() {
        val result = GridTraveler().gridTraveler(3, 3)
        assertEquals(6, result)
    }

    @Test
    fun `the travel should walk 3 step to grid 2,3 `() {
        val result = GridTraveler().gridTraveler(2, 3)
        assertEquals(3, result)
    }

    @Test
    fun `the travel should walk 3 step to grid 3,2 `() {
        val result = GridTraveler().gridTraveler(3, 2)
        assertEquals(3, result)
    }

    @Test
    fun `the travel should walk 2333606220 step to grid 18,18 `() {
        val result = GridTraveler().gridTraveler(18, 18)
        assertEquals(2333606220, result)
    }
}