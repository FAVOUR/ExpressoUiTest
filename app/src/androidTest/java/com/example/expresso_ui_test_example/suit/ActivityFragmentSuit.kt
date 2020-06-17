package com.example.expresso_ui_test_example.suit

import com.example.expresso_ui_test_example.ui.movie.*
import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
    DirectorsFragmentTest::class,
    MainActivityTest::class,
    MovieDetailFragmentTest::class,
    StarActorsFragmentTest::class

)
class ActivityFragmentSuit {
}