package com.example.movieapp_jetpack.models

data class Details(
    val actors:String = "",
    val award:String = "",
    val country:String = "",
    val director:String = "",
    val genres:List<String> = listOf(),
    val id:Int = 0,
    val images:List<String> = listOf(),
    val imdb_id:String = "",
    val imdb_rating:String = "",
    val imdb_votes:String = "",
    val metascore:String = "",
    val plot:String = "",
    val poster:String = "",
    val rated:String = "",
    val released:String = "",
    val runtime:String = "",
    val title:String = "",
    val type:String = "",
    val writer:String = "",
    val year:String = ""

)
