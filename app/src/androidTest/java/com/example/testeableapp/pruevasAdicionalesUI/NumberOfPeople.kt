package com.example.testeableapp.pruevasAdicionalesUI

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import com.example.testeableapp.MainActivity
import org.junit.Rule
import org.junit.Test

class NumberOfPeopleTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun numberOfPeople_increasesAndDecreasesWithButtons() {

        composeTestRule.onNodeWithText("Número de personas: 1").assertExists()

        composeTestRule.onNodeWithText("+").performClick()

        composeTestRule.onNodeWithText("Número de personas: 2").assertExists()

        composeTestRule.onNodeWithText("-").performClick()

        composeTestRule.onNodeWithText("Número de personas: 1").assertExists()
    }
}
