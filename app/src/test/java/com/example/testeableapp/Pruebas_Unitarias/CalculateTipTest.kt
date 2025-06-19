package com.example.testeableapp.Pruebas_Unitarias

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculateTipTest {

    //#1 Calculo del 20% de Propina
    @Test
    fun test_calculateTip_20Percent(){
        val result = calculateTip(amount = 100.0, tipPercent = 20, roundUp = false)
        assertEquals(20.0, result, 0.01)
    }

    //#2 Calculo del 15% y redondeo
    @Test
    fun test_calculateTip_15PercentWithRounding(){
        val result = calculateTip(amount = 100.0, tipPercent = 15, roundUp = true)
        assertEquals(15.0, result, 0.01)
    }

    //#3 Calculo con cantidad negativa
    @Test
    fun test_calculateTip_negativeAmount(){
        val result = calculateTip(amount = -50.0, tipPercent = 20, roundUp = false)
        assertEquals(0.0, result, 0.01)
    }

    //#4 Total a pagar por persona
    @Test
    fun test_calculateTotalPerPerson(){
        val amount = 100.0
        val tip = calculateTip(amount, 20, false)
        val numberOfPeople = 4
        val totalPerPerson = (amount + tip)/ numberOfPeople
        assertEquals(30.0, totalPerPerson, 0.01)
    }
}