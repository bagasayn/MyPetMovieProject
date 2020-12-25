package com.example.mypetmovieproject.view.movies

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails

class ViewHolderMovies(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val movie: ImageView = itemView.findViewById(R.id.movie_image)
    private val like: ImageView = itemView.findViewById(R.id.mini_like)
    private val age: TextView = itemView.findViewById(R.id.mini_age_text)
    private val starOne: ImageView = itemView.findViewById(R.id.mini_icon_1)
    private val starTwo: ImageView = itemView.findViewById(R.id.mini_icon_2)
    private val starThree: ImageView = itemView.findViewById(R.id.mini_icon_3)
    private val starFour: ImageView = itemView.findViewById(R.id.mini_icon_4)
    private val starFive: ImageView = itemView.findViewById(R.id.mini_icon_5)
    private val categoryMovies: TextView = itemView.findViewById(R.id.mini_category_movies)
    private val reviews: TextView = itemView.findViewById(R.id.mini_reviews)
    private val nameMovie: TextView = itemView.findViewById(R.id.mini_name_film)
    private val time: TextView = itemView.findViewById(R.id.mini_time)

    fun bind(data: MoviesDetails) {

        // TODO: icon movie
        movie.setImageResource(data.movie)

        // TODO: icon like
        if (data.like) like.setImageResource(R.drawable.ic_mini_like_on) else like.setImageResource(
            R.drawable.ic_mini_like_off
        )

        // TODO: text age
        age.text = data.age

        // TODO: start stars
        if (data.starOne) {
            starOne.setImageResource(R.drawable.ic_mini_star)
        } else {
            starOne.setImageResource(R.drawable.ic_mini_star_off)
            starTwo.setImageResource(R.drawable.ic_mini_star_off)
            starThree.setImageResource(R.drawable.ic_mini_star_off)
            starFour.setImageResource(R.drawable.ic_mini_star_off)
            starFive.setImageResource(R.drawable.ic_mini_star_off)
        }

        if (data.starTwo) {
            starTwo.setImageResource(R.drawable.ic_mini_star)
        } else {
            starTwo.setImageResource(R.drawable.ic_mini_star_off)
            starThree.setImageResource(R.drawable.ic_mini_star_off)
            starFour.setImageResource(R.drawable.ic_mini_star_off)
            starFive.setImageResource(R.drawable.ic_mini_star_off)
        }

        if (data.starThree) {
            starThree.setImageResource(R.drawable.ic_mini_star)
        } else {
            starThree.setImageResource(R.drawable.ic_mini_star_off)
            starFour.setImageResource(R.drawable.ic_mini_star_off)
            starFive.setImageResource(R.drawable.ic_mini_star_off)
        }

        if (data.starFour) {
            starFour.setImageResource(R.drawable.ic_mini_star)
        } else {
            starFour.setImageResource(R.drawable.ic_mini_star_off)
            starFive.setImageResource(R.drawable.ic_mini_star_off)
        }

        if (data.starFive) {
            starFive.setImageResource(R.drawable.ic_mini_star)
        } else {
            starFive.setImageResource(R.drawable.ic_mini_star_off)
        }
        // TODO: end stars

        // TODO: category movies
        categoryMovies.text = data.categoryMovies

        // TODO: reviews
        reviews.text = data.reviews

        // TODO: name movie
        nameMovie.text = data.nameMovie

        // TODO: time
        time.text = data.time
    }
}