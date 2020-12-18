package com.example.mypetmovieproject

import com.example.mypetmovieproject.model.MoviesDetails

interface ClickListener {
    fun openMovieDetails(movies: MoviesDetails)
    fun back()
}