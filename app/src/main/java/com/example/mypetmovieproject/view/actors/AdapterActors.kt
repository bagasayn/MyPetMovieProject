package com.example.mypetmovieproject.view.actors

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.ActorsDetails


class AdapterActors(
    context: Context,
    private val actors: List<ActorsDetails>
) : RecyclerView.Adapter<ViewHolderActors>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActors {
        return ViewHolderActors(inflater.inflate(R.layout.view_holder_actor, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderActors, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return actors.size
    }

    fun getItem(position: Int): ActorsDetails = actors[position]
}