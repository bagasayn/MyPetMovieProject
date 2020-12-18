package com.example.mypetmovieproject.view.actors

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.ActorsDetails

class ViewHolderActors(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val actorIcon : ImageView = itemView.findViewById(R.id.actor_icon)
    private val actorName : TextView = itemView.findViewById(R.id.actor_name)

    fun bind(data: ActorsDetails){
        actorIcon.setImageResource(data.icon)
        actorName.text = data.name.toString()
    }
}