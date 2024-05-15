package com.example.movieapp_jetpack.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp_jetpack.models.Data
import kotlinx.coroutines.launch

class MovieViewModel:ViewModel() {
    private val movieRepository = MovieRepository()
    var state by mutableStateOf(ScreenState())

    init {
        viewModelScope.launch {
            val movieList = movieRepository.getMovieList(state.page)
            state = state.copy(
                movies = movieList.body()!!.data
            )
        }
    }
}

data class ScreenState(
    val movies: List<Data> = emptyList(),
    val page: Int = 1
)