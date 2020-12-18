package com.example.mypetmovieproject.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

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
@Parcelize
data class MoviesDetails(
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
) : Parcelable

