package com.example.expresso_ui_test_example.ui.movie

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expresso_ui_test_example.R
import com.example.expresso_ui_test_example.data.DummyMovies
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class StarActorsFragmentTest{

    @Test
    fun setupFragment_insertValues_checkTheMovieContent(){
        var fragmentFactory = FragmentFactory()
        var movie = DummyMovies.INFINITY_WAR

        var bundle = Bundle()

//        bundle.putStringArrayList("args_actors", movie.star_actors)
        bundle.putStringArrayList("args_actors", movie.star_actors)

        //var activitySenerio = launchFragmentInContainer<MovieDetailFragment> (fragmentArgs = bundle,factory = fragmentFactory ) //with factory

        var fragmentScenario = launchFragmentInContainer<StarActorsFragment>(
            fragmentArgs = bundle,
            themeResId = R.style.AppTheme)   //Without the factory

//        delay(5000)

        onView(ViewMatchers.withId(R.id.star_actors_text))
            .check(matches(isDisplayed()))
//        onView(ViewMatchers.withId(R.id.movie_description)).check(matches(withText("")))


    }




}