package com.example.expresso_ui_test_example.ui.movie

import android.app.Activity
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

   @Test
   fun fragment_bundleAdded_confirmbuncleisequalsOne()= runBlocking{
       var activitySenerio = ActivityScenario.launch(MainActivity::class.java)

             delay(5000)
   }
}