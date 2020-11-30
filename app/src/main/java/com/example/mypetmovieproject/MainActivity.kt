package com.example.mypetmovieproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_movies_list)

        val miniLogo = findViewById<ImageView>(R.id.movie_avengers)
        miniLogo.clipToOutline = true

//        robert.clipToOutline = true
//        val robert = findViewById<ImageView>(R.id.robert)
//        robert.clipToOutline = true
//
//        val evans = findViewById<ImageView>(R.id.evans)
//        evans.clipToOutline = true
//
//        val mark = findViewById<ImageView>(R.id.mark)
//        mark.clipToOutline = true
//
//        val hemsworth = findViewById<ImageView>(R.id.hemsworth)
//        hemsworth.clipToOutline = true

    }
}