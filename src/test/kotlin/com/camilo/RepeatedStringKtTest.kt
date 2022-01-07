package com.camilo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class RepeatedStringKtTest {

    @Test
    fun `it should return 7 with input aba and 10`() {
        val input = "aba"
//        val input = "abaabaabaaba"
        val n: Long = 10
        val result = repeatedString(input, n)
        Assertions.assertEquals(7, result)

    }

    @Test
    fun `it should return 1000000000000 with input a and 1000000000000`() {
        val input = "a"
        val n: Long = 1000000000000
        val result = repeatedString(input, n)
        Assertions.assertEquals(1000000000000, result)

    }

    @Test
    fun `it should return 588525 with input aab and 882787`() {
        val input = "aab"
        val n: Long = 882787
        val result = repeatedString(input, n)
        Assertions.assertEquals(588525, result)
    }

    @Test
    fun `it should return 4 with kmretata and 20`() {
        val input = "kmareta"
        val n: Long = 10
        val result = repeatedString(input, n)
        Assertions.assertEquals(3, result)
    }


    @Test
    fun `it should return 0 with d and 590826798023`() {
        val input = "d"
        val n: Long = 590826798023
        val result = repeatedString(input, n)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun `it should return 164280 with gfcaaaecbg and 547602`() {
        val input = "gfcaaaecbg"
        val n: Long = 547602
        val result = repeatedString(input, n)
        Assertions.assertEquals(164280, result)
    }

    @Test
    fun `it should return 2 with ababa and 3`() {
        val input = "ababa"
        val n: Long = 3
        val result = repeatedString(input, n)
        Assertions.assertEquals(2, result)
    }


    @Test
    fun `it should return 69801196944 with udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps and 872514961806`() {
        val input =
            "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps"
        val n: Long = 872514961806
        val result = repeatedString(input, n)
        Assertions.assertEquals(69801196944, result)
    }
}