package com.example.tamagotchiapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PetActivityTest {

    @Before
    fun setUp() {
        // Launch the activity
        ActivityScenario.launch(PetActivity::class.java)
    }

    @Test
    fun testFeedButtonClick() {
        // Click on the feed button
        onView(withId(R.id.feedbutton)).perform(click())

        // Check if foodBowl is visible and other views are invisible
        onView(withId(R.id.imageView3)).check(matches(isDisplayed()))
        onView(withId(R.id.imageView4)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))
        onView(withId(R.id.imageView5)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))

        // Check if hungerCount is set to 10
        onView(withId(R.id.hungerText)).check(matches(withText("10")))
    }

    @Test
    fun testWashButtonClick() {
        // Click on the wash button
        onView(withId(R.id.washbutton)).perform(click())

        // Check if soapyFoam is visible and other views are invisible
        onView(withId(R.id.imageView4)).check(matches(isDisplayed()))
        onView(withId(R.id.imageView3)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))
        onView(withId(R.id.imageView5)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))

        // Check if washCount is set to 10
        onView(withId(R.id.cleanText)).check(matches(withText("10")))
    }

    @Test
    fun testPlayButtonClick() {
        // Click on the play button
        onView(withId(R.id.playbutton)).perform(click())

        // Check if tennisBall is visible and other views are invisible
        onView(withId(R.id.imageView5)).check(matches(isDisplayed()))
        onView(withId(R.id.imageView3)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))
        onView(withId(R.id.imageView4)).check(matches(withEffectiveVisibility(Visibility.INVISIBLE)))

        // Check if playCount is set to 10
        onView(withId(R.id.happyText)).check(matches(withText("10")))
    }
}
