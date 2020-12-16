package com.example.mypetmovieproject

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderActors(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val actorIcon : ImageView = itemView.findViewById(R.id.actor_icon)
    private val actorName : TextView = itemView.findViewById(R.id.actor_name)

    fun bind(data:DataActors){
        actorIcon.setImageResource(data.icon)
        actorName.text = data.name.toString()
    }
}