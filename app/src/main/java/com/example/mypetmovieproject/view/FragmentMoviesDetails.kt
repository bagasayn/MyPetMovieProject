package com.example.mypetmovieproject.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mypetmovieproject.ClickListener
import com.example.mypetmovieproject.R
import com.example.mypetmovieproject.model.MoviesDetails

class FragmentMoviesDetails : Fragment() {
    private var listener: ClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //(что мы хотим передать,
        // куда мы хотим передать,
        // необхожимость привязать наш фрагмент к нашему контейнеру)
        val view = inflater.inflate(R.layout.fragment_movie_details, container, false)

        //поиск view на фрагменте
//        view?.findViewById<ImageView>(R.id.movie_avengers)?.apply{clipToOutline = true}
//        view?.findViewById<ImageView>(R.id.robert)?.apply { clipToOutline = true }
//        view?.findViewById<ImageView>(R.id.evans)?.apply { clipToOutline = true }
//        view?.findViewById<ImageView>(R.id.mark)?.apply { clipToOutline = true }
//        view?.findViewById<ImageView>(R.id.hemsworth)?.apply { clipToOutline = true }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

