package com.example.revising

import MoviesResponseItem
import android.graphics.Movie
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel(private val repository: MoviesRepository) : ViewModel() {

    private val _movies=MutableLiveData<List<MoviesResponseItem>>()
    val movies:LiveData<List<MoviesResponseItem>>
    get() = _movies

    suspend fun getmovies(){
        val movies=repository.getmovies()
        _movies.value=movies
    }
}