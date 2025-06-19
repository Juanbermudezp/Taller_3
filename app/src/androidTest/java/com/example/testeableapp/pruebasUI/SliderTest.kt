package com.example.testeableapp.pruebasUI

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.click
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeRight
import com.example.testeableapp.ui.Screens.TipCalculatorScreen
import org.junit.Rule
import org.junit.Test

class Slider_Test {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun sliderTest() {
        composeTestRule.setContent {
            TipCalculatorScreen()
        }

        composeTestRule.onNodeWithTag("billAmountTextField")
            .performTextInput("100.00")

        composeTestRule.onNodeWithTag("tipPercentageText")
            .assertTextContains("Porcentaje de propina: 15%")

        composeTestRule.onNodeWithTag("tipSlider")
            .performTouchInput {
                val sliderWidth = width // Get the width of the slider composable
                val xCoordinate = sliderWidth * (20f / 50f) // (target_value / max_value) * width
                val clickPosition = Offset(x = xCoordinate, y = height / 2f)
                click(clickPosition)
            }

        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithTag("tipPercentageText")
            .assertTextContains("Porcentaje de propina: 20%")

        composeTestRule.onNodeWithTag("tipAmountText")

            .assertTextContains("Propina: $20.00")
    }
}