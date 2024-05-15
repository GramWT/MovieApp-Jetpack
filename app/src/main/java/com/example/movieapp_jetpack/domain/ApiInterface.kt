package com.example.movieapp_jetpack.domain

import com.example.movieapp_jetpack.models.Details
import com.example.movieapp_jetpack.models.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("movies?")
    suspend fun getMovie(
        @Query("page") page: Int
    ): Response<MovieList>

    @GET("movies/{movie_id}")
    suspend fun getDetailsById(
        @Path("movie_id") id: Int
    ): Response<Details>
}