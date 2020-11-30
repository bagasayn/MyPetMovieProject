package com.example.mypetmovieproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity(), ClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeRadius()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(
                    R.id.fragment_movie_details, FragmentMoviesList()
                ).commit()
            }
        }

    }

    private fun changeRadius() {
        val miniLogo = findViewById<ImageView>(R.id.movie_avengers)
        miniLogo.clipToOutline = true

        val robert = findViewById<ImageView>(R.id.robert)
        robert.clipToOutline = true

        val evans = findViewById<ImageView>(R.id.evans)
        evans.clipToOutline = true

        val mark = findViewById<ImageView>(R.id.mark)
        mark.clipToOutline = true

        val hemsworth = findViewById<ImageView>(R.id.hemsworth)
        hemsworth.clipToOutline = true
    }

    override fun openMovieDetails() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_movie_details, FragmentMoviesDetails())
            .addToBackStack(null)
            .commit()
    }
}
