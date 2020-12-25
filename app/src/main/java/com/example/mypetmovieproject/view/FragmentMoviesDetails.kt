package com.example.mypetmovieproject.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.ClickListener
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.data.DataSource
import com.example.mypetmovieproject.model.MoviesDetails
import com.example.mypetmovieproject.view.actors.AdapterActors

class FragmentMoviesDetails : Fragment() {
    private var listener: ClickListener? = null
    private var movie: MoviesDetails? = null
    private var adapter = AdapterActors()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movie = arguments?.getParcelable("movie")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //(что мы хотим передать,
        // куда мы хотим передать,
        // необхожимость привязать наш фрагмент к нашему контейнеру)
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter.bindActors(actors = DataSource.actors)
        val recycler = requireView().findViewById<RecyclerView>(R.id.rv_actors)
        recycler.apply {
            adapter = this@FragmentMoviesDetails.adapter
            layoutManager = LinearLayoutManager(
                requireContext(), RecyclerView.HORIZONTAL, false
            )
            setHasFixedSize(true)

        }
        view.findViewById<TextView>(R.id.back_text).setOnClickListener {
            listener?.back()
        }
    }

    //ищем с context Activity наш listener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickListener) listener = context
    }

    //обнуляем listener для избежания утечки памяти
    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {
        fun instance(movie: MoviesDetails): FragmentMoviesDetails {
            return FragmentMoviesDetails().apply {
                arguments = Bundle().apply {
                    putParcelable("movie", movie)
                }
            }
        }

    }
}

