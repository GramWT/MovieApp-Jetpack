package com.example.movieapp_jetpack.viewmodel

import com.example.movieapp_jetpack.models.Details
import com.example.movieapp_jetpack.models.MovieList
import com.example.movieapp_jetpack.utils.RetrofitInstance
import retrofit2.Response

class MovieRepository {
    suspend fun getMovieList(page:Int):Response<MovieList>{
        return RetrofitInstance.api.getMovie(page)
    }

    suspend fun getDetailsById(id:Int):Response<Details>{
        return RetrofitInstance.api.getDetailsById(id)
    }
}