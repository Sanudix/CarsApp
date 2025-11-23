package com.example.carsapp.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarModel(
    val title: String = "",
    val description: String = "",
    val totalCapacity: String = "",
    val highestSpeed: String = "",
    val engineOutput: String = "",
    val picUrl: String = "",
    val price: String = "",
    val rating: String = "",
) : Parcelable
