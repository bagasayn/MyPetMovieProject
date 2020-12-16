package com.example.mypetmovieproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AdapterMovies(
    context: Context,
    private val movies: List<DataMoviesDetails>
) : RecyclerView.Adapter<ViewHolderMovies>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovies {
        return ViewHolderMovies(inflater.inflate(R.layout.view_holder_movie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderMovies, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun getItem(position: Int): DataMoviesDetails = movies[position]

}