package com.example.mypetmovieproject.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class ActorsDetails(
    @DrawableRes
    val icon: Int,
    @StringRes
    val name: Int
): Parcelable

