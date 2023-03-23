package com.example.revising

import MoviesResponse
import MoviesResponseItem
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface MoviesApi {

    @GET("movielist.json")
    suspend fun getmovies(): Response<List<MoviesResponseItem>>

    companion object{
        operator fun invoke():MoviesApi{
            return Retrofit.Builder().
            addConverterFactory(GsonConverterFactory.create()).baseUrl("https://www.howtodoandroid.com/").build().create(MoviesApi::class.java)


        }

    }


}