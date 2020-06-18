package com.example.expresso_ui_test_example.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.runner.AndroidJUnitRunner
import com.example.expresso_ui_test_example.R
import com.example.expresso_ui_test_example.ui.movie.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Test
     fun lunchActivity_navigate_connfirmItIsDisplayed(){
        var activitySenerio = ActivityScenario.launch(MainActivity::class.java)

              onView(withId(R.id.movie_directiors)).perform(click())

              pressBack()

              onView(withId(R.id.fragment_movie_detail_parent)).check(matches(isDisplayed()))
    }


}