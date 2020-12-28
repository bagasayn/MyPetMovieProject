package com.example.mypetmovieproject.view.movies

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails


class AdapterMovies(
    private val clickListener: OnRecyclerItemClicked
) : RecyclerView.Adapter<ViewHolderMovies>() {

    private var movies: MutableList<MoviesDetails> = mutableListOf()

    interface OnRecyclerItemClicked {
        fun onClick(movies: MoviesDetails)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovies {
        return ViewHolderMovies(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderMovies, position: Int) {
        holder.bind(getItem(position))
        holder.itemView.setOnClickListener {
            clickListener.onClick(movies[position])
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    private fun getItem(position: Int): MoviesDetails = movies[position]

    fun bindMovies(movies: List<MoviesDetails>) {
        this.movies.apply {
            clear()
            addAll(movies)
        }
        notifyDataSetChanged()
    }

}

