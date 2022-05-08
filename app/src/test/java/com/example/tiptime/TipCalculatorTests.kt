package com.example.tiptime


import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_trip_no_round_up() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "2.0"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}