package com.example.mypetmovieproject.view.actors

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.ActorsDetails


class AdapterActors() : RecyclerView.Adapter<ViewHolderActors>() {

    private val actors = mutableListOf<ActorsDetails>()

    fun bindActors(actors: List<ActorsDetails>) {
        this.actors.apply {
            clear()
            addAll(actors)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActors {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
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