package com.example.mypetmovieproject
/**
* Details:
 * movie
 * like
 * age
 * star1
 * star2
 * star3
 * star4
 * star5
 * category
 * reviews
 * name movie
 * time
 */
data class DataMoviesDetails(
    val movie: Int,
    val like: Boolean,
    val age: String,
    val starOne: Boolean,
    val starTwo: Boolean,
    val starThree: Boolean,
    val starFour: Boolean,
    val starFive: Boolean,
    val categoryMovies: String,
    val reviews: String,
    val nameMovie: String,
    val time: String
)

fun generateDataMoviesDetails(): List<DataMoviesDetails> {
    return listOf(
        DataMoviesDetails(
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
        DataMoviesDetails(
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
        DataMoviesDetails(
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
        DataMoviesDetails(
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
