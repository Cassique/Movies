package com.example.android.movies.network

import com.squareup.moshi.Json

data class Movies(
    val id: String,
    @Json(name = "poster_path") val imgSrcUrl: String
)
