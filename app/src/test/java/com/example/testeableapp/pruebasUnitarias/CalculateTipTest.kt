package com.example.testeableapp.pruebasUnitarias

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class CalculateTipTest {

    //#1 Calculo del 20% de Propina
    @Test
    fun test_calculateTip_20Percent(){
        val result = calculateTip(amount = 100.0, tipPercent = 20, roundUp = false)
        Assert.assertEquals(20.0, result, 0.01)
    }

    //#2 Calculo del 15% y redondeo
    @Test
    fun test_calculateTip_15PercentWithRounding(){
        val result = calculateTip(amount = 100.0, tipPercent = 15, roundUp = true)
        Assert.assertEquals(15.0, result, 0.01)
    }

    //#3 Calculo con cantidad negativa
    @Test
    fun test_calculateTip_negativeAmount(){
        val result = calculateTip(amount = -50.0, tipPercent = 20, roundUp = false)
        Assert.assertEquals(0.0, result, 0.01)
    }

    //#4 Total a pagar por persona
    @Test
    fun test_calculateTotalPerPerson(){
        val amount = 100.0
        val tip = calculateTip(amount, 20, false)
        val numberOfPeople = 4
        val totalPerPerson = (amount + tip)/ numberOfPeople
        Assert.assertEquals(30.0, totalPerPerson, 0.01)
    }

    //Pruebas unitarias adicionales

    //#1.Calcular propina cuando la propina es 0
    @Test
    fun `cuando el porcentaje del tip sea 0 calculateTip devuelve 0`() {
        val amount = 100.0
        val tipPercent = 0
        val roundUp = false

        val tip = calculateTip(amount, tipPercent, roundUp)

        assertEquals(0.0, tip, 0.0)
    }

    //#2.Calcular una propina en decimales precisa sin redondear
    @Test
    fun `calcular monto decimal preciso cuando no se redondea`() {
        val tip = calculateTip(
            amount = 75.25,
            tipPercent = 12,
            roundUp = false
        )
        assertEquals(9.03, tip, 0.0001)
    }


}