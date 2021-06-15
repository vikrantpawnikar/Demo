package com.vikrant.screeningdemo

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class StringUtilTest {
    private lateinit var util: StringUtil

    @Before
    fun setup() {
        util = StringUtil()
    }

    @Test
    fun `test filterInputString with capital first char string`() {
        //given
        val input = "Vikrant"

        //then
        assertTrue(util.filterInputString(input))
    }

    @Test
    fun `test filterInputString with small first char string`() {
        //given
        val input = "vikrant"

        //then
        assertFalse(util.filterInputString(input))
    }

    @Test
    fun `test filterInputString with number input`() {
        //given
        val input = "1234"

        //then
        assertFalse(util.filterInputString(input))
    }

    @Test
    fun `test filterInputString with null input`() {
        //given
        val input = null

        //then
        assertFalse(util.filterInputString(input))
    }
}