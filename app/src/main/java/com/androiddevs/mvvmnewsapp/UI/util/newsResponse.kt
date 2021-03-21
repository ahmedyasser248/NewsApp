package com.androiddevs.mvvmnewsapp.UI.util

data class newsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)