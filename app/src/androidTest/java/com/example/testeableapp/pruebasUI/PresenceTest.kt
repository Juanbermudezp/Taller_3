package com.example.testeableapp.pruebasUI

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.testeableapp.ui.Screens.TipCalculatorScreen
import org.junit.Rule
import org.junit.Test

class PresenceTest {
    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun verifyUIElementsPresence() {
        composeTestRule.setContent {
            TipCalculatorScreen()
        }

        composeTestRule.onNodeWithTag("billAmountTextField")
            .assertExists()
        composeTestRule.onNodeWithTag("billAmountTextField")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("tipSlider")
            .assertExists()
        composeTestRule.onNodeWithTag("tipSlider")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("totalPerPersonText")
            .assertExists()
        composeTestRule.onNodeWithTag("totalPerPersonText")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("titleText")
            .assertExists()
        composeTestRule.onNodeWithTag("titleText")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("tipAmountText")
            .assertExists()
        composeTestRule.onNodeWithTag("tipAmountText")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("tipPercentageText")
            .assertExists()
        composeTestRule.onNodeWithTag("tipPercentageText")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("numberOfPeopleText")
            .assertExists()
        composeTestRule.onNodeWithTag("numberOfPeopleText")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("minusButton")
            .assertExists()
        composeTestRule.onNodeWithTag("minusButton")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("plusButton")
            .assertExists()
        composeTestRule.onNodeWithTag("plusButton")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("checkboxRoundUp")
            .assertExists()
        composeTestRule.onNodeWithTag("checkboxRoundUp")
            .assertIsDisplayed()

        composeTestRule.onNodeWithTag("checkboxRoundUpText")
            .assertExists()
        composeTestRule.onNodeWithTag("checkboxRoundUpText")
            .assertIsDisplayed()
    }
}