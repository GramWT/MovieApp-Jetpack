package com.example.movieapp_jetpack.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp_jetpack.models.Data
import com.example.movieapp_jetpack.models.Details
import kotlinx.coroutines.launch

class MovieViewModel:ViewModel() {
    private val movieRepository = MovieRepository()
    var state by mutableStateOf(ScreenState())
    var id by mutableStateOf(0)

    init {
        viewModelScope.launch {
            val movieList = movieRepository.getMovieList(state.page)
            state = state.copy(
                movies = movieList.body()!!.data
            )
        }
    }

    fun getDetailsById(){
        viewModelScope.launch {
            try {
                val response = movieRepository.getDetailsById(id)
                if (response.isSuccessful){
                    state = state.copy(
                        detailsData = response.body()!!
                    )
                }
            }catch (e:Exception){

            }
        }
    }
}

data class ScreenState(
    val movies: List<Data> = emptyList(),
    val page: Int = 1,
    val detailsData:Details = Details()
)