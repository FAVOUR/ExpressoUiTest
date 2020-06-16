package com.example.expresso_ui_test_example.data.source

import com.example.expresso_ui_test_example.data.DummyMovies.INFINITY_WAR
import com.example.expresso_ui_test_example.data.DummyMovies.THE_RUNDOWN
import com.example.expresso_ui_test_example.data.Movie

object MoviesRemoteDataSource: MoviesDataSource {

    private var MOVIES_REMOTE_DATA = LinkedHashMap<Int, Movie>(2)

    init {
        addMovie(INFINITY_WAR)
        addMovie(THE_RUNDOWN)
    }

    override fun getMovie(movieId: Int): Movie? {
        return MOVIES_REMOTE_DATA[movieId]
    }

    private fun addMovie(movie: Movie){
        MOVIES_REMOTE_DATA.put(movie.id, movie)
    }


}














