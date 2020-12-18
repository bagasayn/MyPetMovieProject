package com.example.mypetmovieproject.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails
import com.example.mypetmovieproject.data.DataSource
import com.example.mypetmovieproject.view.movies.AdapterMovies
import com.example.mypetmovieproject.view.movies.OnRecyclerItemClicked

import com.google.android.material.snackbar.Snackbar

class FragmentMoviesList : Fragment() {

    //    private var listener: ClickListener? = null
    private var moviesRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //(что мы хотим передать,
        // куда мы хотим передать,
        // необхожимость привязать наш фрагмент к нашему контейнеру)
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //слушаем нажатие на View нашего фильма
//        view.findViewById<View>(R.id.fragment_movie_details).setOnClickListener {
//            listener?.openMovieDetails()
//        }
        moviesRecycler = view.findViewById(R.id.rv_list_movies)
        moviesRecycler?.adapter = AdapterMovies(clickListener)
    }


    private val clickListener = object : OnRecyclerItemClicked {
        override fun onClick(movies: MoviesDetails) {
            moviesRecycler?.let { rv ->
                Snackbar.make(
                    rv,
                    getString(R.string.fragment_actors_chosen_text, movies.nameMovie),
                    Snackbar.LENGTH_SHORT
                    )
            }
        }
    }


    override fun onStart() {
        super.onStart()
        (moviesRecycler?.adapter as? AdapterMovies)?.apply {
            bindMovies(DataSource.movies)
        }
    }
    //обнуляем listener для избежания утечки памяти
    override fun onDetach() {

        moviesRecycler = null
        super.onDetach()
    }


}