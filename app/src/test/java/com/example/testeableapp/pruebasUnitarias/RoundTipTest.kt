package com.example.testeableapp.pruebasUnitarias

import com.example.testeableapp.ui.Screens.calculateTip
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.After
import org.junit.Test


class RoundTip_Test {
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun redondearPropina() {
        val amount = 38.45
        val tipPercent = 15
        val roundUp = true

        val expectedTip = 6.00
        val actualTip = calculateTip(amount, tipPercent, roundUp)

        assertEquals(expectedTip, actualTip, 0.01)
    }

    @Test
    fun noRedondearPropina() {
        val amount = 38.45
        val tipPercent = 15
        val roundUp = false

        val expectedTip = 5.77
        val actualTip = calculateTip(amount, tipPercent, roundUp)

        assertEquals(expectedTip, actualTip, 0.01)
    }
}