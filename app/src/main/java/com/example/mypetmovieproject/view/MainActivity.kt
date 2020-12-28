package com.example.mypetmovieproject.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mypetmovieproject.ClickListener
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails


class MainActivity : AppCompatActivity(), ClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //передаем в контейнер наш фрагмент
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(
                    R.id.main_container, FragmentMoviesList()
                ).commit()
            }
        }

    }

    override fun openMovieDetails(movies: MoviesDetails) {
        //заменяем в контейнере фрагмент на новый и добавляем старый в backStack
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.main_container,
                FragmentMoviesDetails.instance(movies)
            )
            .addToBackStack(null)
            .commit()
    }

    override fun back() {
        supportFragmentManager.popBackStack()
    }


}
