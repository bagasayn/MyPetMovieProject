package com.example.mypetmovieproject.view


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mypetmovieproject.ClickListener
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails
import com.example.mypetmovieproject.data.DataSource
import com.example.mypetmovieproject.view.movies.AdapterMovies


class FragmentMoviesList : Fragment(), AdapterMovies.OnRecyclerItemClicked {

    private var listener: ClickListener? = null
    private var adapterMovies = AdapterMovies(this)

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
        val recycler = requireView().findViewById<RecyclerView>(R.id.rv_list_movies)
        recycler.apply {
            adapter = this@FragmentMoviesList.adapterMovies
            layoutManager = GridLayoutManager(requireContext(), 2)
        }
        adapterMovies.bindMovies(DataSource.movies)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickListener) listener = context
    }

    //обнуляем listener для избежания утечки памяти
    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onClick(movies: MoviesDetails) {
        listener?.openMovieDetails(movies)
    }


}