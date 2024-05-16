package com.example.movieapp_jetpack.paging

interface Pagination<Key,Item> {
    suspend fun loadNextPage()

    fun reset()
}