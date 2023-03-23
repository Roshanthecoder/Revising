package com.example.revising

class MoviesRepository (private val api: MoviesApi):SafeApiRequest(){

    suspend fun getmovies()=apiRequest { api.getmovies() }

}


