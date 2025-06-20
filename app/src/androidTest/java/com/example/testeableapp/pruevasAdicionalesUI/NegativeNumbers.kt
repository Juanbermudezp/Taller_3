package com.example.testeableapp.pruevasAdicionalesUI

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import com.example.testeableapp.MainActivity
import org.junit.Rule
import org.junit.Test


class NegativeNumbers {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun numberOfPeople_notNegative() {
        composeTestRule.onNodeWithText("Número de personas: 1").assertExists()

        repeat(3) {
            composeTestRule.onNodeWithText("-").performClick()
        }

        composeTestRule.onNodeWithText("Número de personas: 1").assertExists()
    }


}