package com.example.expresso_ui_test_example.ui.movie

import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expresso_ui_test_example.R
import com.example.expresso_ui_test_example.data.DummyMovies.INFINITY_WAR
import com.example.expresso_ui_test_example.data.DummyMovies.THE_RUNDOWN
import com.example.expresso_ui_test_example.data.Movie
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MovieDetailFragmentTest{

    @Test
    fun setupFragment_insertValues_checkTheMovieContent(){
        var fragmentFactory = FragmentFactory()
        var movie = INFINITY_WAR

        var bundle = Bundle()

        bundle.putInt("movie_id",movie.id)
  //var activitySenerio = launchFragmentInContainer<MovieDetailFragment> (fragmentArgs = bundle,factory = fragmentFactory ) //with factory

        var fragmentScenario = launchFragmentInContainer<MovieDetailFragment>(
            fragmentArgs = bundle,
            themeResId = R.style.AppTheme)   //Without the factory

//        delay(5000)

        onView(withId(R.id.movie_description)).check(matches(withText(movie.description)))
        onView(withId(R.id.movie_title)).check(matches(withText(movie.title)))


    }

}