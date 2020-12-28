package com.example.mypetmovieproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList: Fragment() {
    private var listener: ClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //(что мы хотим передать,
        // куда мы хотим передать,
        // необхожимость привязать наш фрагмент к нашему контейнеру)
        return inflater.inflate(R.layout.fragment_movies_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //слушаем нажатие на View нашего фильма
        view.findViewById<View>(R.id.fragment_movie_details).setOnClickListener {
            listener?.openMovieDetails()
        }
    }
    //ищем с context Activity наш listener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ClickListener) listener = context
    }
    //обнуляем listener для избежания утечки памяти
    override fun onDetach() {
        super.onDetach()
        listener = null
    }


}