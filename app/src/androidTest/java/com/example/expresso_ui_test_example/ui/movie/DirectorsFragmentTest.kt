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
import com.example.expresso_ui_test_example.R
import com.example.expresso_ui_test_example.data.DummyMovies
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DirectorsFragmentTest{

    @Test
    fun setupFragment_insertValues_checkIfDirectorsAreDisplayed(){
        var fragmentFactory = FragmentFactory()
        var movie = DummyMovies.INFINITY_WAR

        var bundle = Bundle()

//        bundle.putStringArrayList("args_actors", movie.star_actors)
        bundle.putStringArrayList("args_directors", movie.directors)

        //var activitySenerio = launchFragmentInContainer<MovieDetailFragment> (fragmentArgs = bundle,factory = fragmentFactory ) //with factory

            var fragmentScenario = launchFragmentInContainer<DirectorsFragment>(
            fragmentArgs = bundle,factory =fragmentFactory)   //Without the Style so it is either you pass the apps central theme sa style or you lunch the fragment

//        delay(5000)

        onView(ViewMatchers.withId(R.id.directors_text))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(ViewMatchers.withId(R.id.directors_text)).check(matches(withText(movie.directors?.let {
            DirectorsFragment.stringBuilderForDirectors(
                it
            )
        })))


    }

}