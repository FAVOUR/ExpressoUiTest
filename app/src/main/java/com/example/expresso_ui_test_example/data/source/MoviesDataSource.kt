package com.example.expresso_ui_test_example.data.source

import com.example.expresso_ui_test_example.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}