package com.example.mypetmovieproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class AdapterActors(
    context: Context,
    private val actors: List<DataActors>
):RecyclerView.Adapter<ViewHolderActors>() {

    private val inflater : LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActors {
        return ViewHolderActors(inflater.inflate(R.layout.view_holder_actor , parent , false))
    }

    override fun onBindViewHolder(holder: ViewHolderActors, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return actors.size
    }
    fun getItem(position: Int) : DataActors = actors[position]
}