package com.example.expresso_ui_test_example.suit

import com.example.expresso_ui_test_example.ui.movie.MainActivityTest
import com.example.expresso_ui_test_example.ui.movie.MovieDetailFragmentTest
import com.example.expresso_ui_test_example.ui.movie.StarActorsFragment
import com.example.expresso_ui_test_example.ui.movie.StarActorsFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(

    MainActivityTest::class,
    MovieDetailFragmentTest::class,
    StarActorsFragmentTest::class

)
class ActivityFragmentSuit {
}