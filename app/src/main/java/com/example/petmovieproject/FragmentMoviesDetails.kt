package com.example.petmovieproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

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
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
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
}

