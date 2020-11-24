package com.example.mypetmovieproject

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val robert = findViewById<ImageView>(R.id.robert)
        robert.clipToOutline = true

        val evans = findViewById<ImageView>(R.id.evans)
        evans.clipToOutline = true

        val mark = findViewById<ImageView>(R.id.mark)
        mark.clipToOutline = true

        val hemsworth = findViewById<ImageView>(R.id.hemsworth)
        hemsworth.clipToOutline = true

    }
}