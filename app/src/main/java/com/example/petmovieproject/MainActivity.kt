package com.example.petmovieproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


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
    override fun openMovieDetails() {
        //заменяем в контейнере фрагмент на новый и добавляем старый в backStack
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, FragmentMoviesDetails())
            .addToBackStack(null)
            .commit()
    }

    override fun back() {
        supportFragmentManager.popBackStack()
    }


}
