package com.example.movieapp_jetpack.viewmodel

import com.example.movieapp_jetpack.models.MovieList
import com.example.movieapp_jetpack.utils.RetrofitInstance
import retrofit2.Response

class MovieRepository {
    suspend fun getMovieList(page:Int):Response<MovieList>{
        return RetrofitInstance.api.getMovie(page)
    }
}