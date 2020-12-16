package com.example.mypetmovieproject

data class DataActors(
    val icon: Int,
    val name: Int
)
fun generateActors(): List<DataActors>{
    return listOf(
        DataActors(
            R.drawable.robert,
            R.string.robert_downey_jr
        ),
        DataActors(
            R.drawable.evans,
            R.string.chris_evans
        ),
        DataActors(
            R.drawable.mark,
            R.string.mark_ruffalo
        ),
        DataActors(
            R.drawable.hemsworth,
            R.string.chris_hemsworth
        )
    )
}
