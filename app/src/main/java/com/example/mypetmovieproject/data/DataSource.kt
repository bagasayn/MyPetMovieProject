package com.example.mypetmovieproject.data

import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.ActorsDetails
import com.example.mypetmovieproject.model.MoviesDetails

object DataSource {
    val actors = listOf(
        ActorsDetails(
            R.drawable.robert,
            R.string.robert_downey_jr
        ),
        ActorsDetails(
            R.drawable.evans,
            R.string.chris_evans
        ),
        ActorsDetails(
            R.drawable.mark,
            R.string.mark_ruffalo
        ),
        ActorsDetails(
            R.drawable.hemsworth,
            R.string.chris_hemsworth
        )
    )
    val movies = listOf(
        MoviesDetails(
            R.drawable.avengers_end_game,
            false,
            "13+",
            starOne = true,
            starTwo = true,
            starThree = true,
            starFour = true,
            starFive = false,
            categoryMovies = "Action, Adventure, Drama",
            reviews = "125 Reviews",
            nameMovie = "Avengers: End Game",
            time = "137 min"
        ),
        MoviesDetails(
            R.drawable.tenet,
            true,
            "16+",
            starOne = true,
            starTwo = true,
            starThree = true,
            starFour = true,
            starFive = true,
            categoryMovies = "Action, Sci-Fi, Thriller ",
            reviews = "98 Reviews",
            nameMovie = "Tenet",
            time = "97 min"
        ),
        MoviesDetails(
            R.drawable.black_widow,
            false,
            "13+",
            starOne = true,
            starTwo = true,
            starThree = true,
            starFour = true,
            starFive = false,
            categoryMovies = "Action, Adventure, Sci-Fi",
            reviews = "38 Reviews",
            nameMovie = "Black Widow",
            time = "102 min"
        ),
        MoviesDetails(
            R.drawable.wonder_woman,
            false,
            "16+",
            starOne = true,
            starTwo = true,
            starThree = true,
            starFour = true,
            starFive = true,
            categoryMovies = "Action, Adventure, Fantasy",
            reviews = "74 Reviews",
            nameMovie = "Wonder Woman 1984",
            time = "120 min"
        )
    )
}