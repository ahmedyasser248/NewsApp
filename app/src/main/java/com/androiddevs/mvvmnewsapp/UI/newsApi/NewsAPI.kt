package com.androiddevs.mvvmnewsapp.UI.newsApi

import com.androiddevs.mvvmnewsapp.UI.util.Constants.Companion.API_KEY
import com.androiddevs.mvvmnewsapp.UI.util.newsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode :String="us",
        @Query("page")pageNumber : Int =1 ,
        @Query("apiKey")
        apiKey : String =API_KEY
    ):Response<newsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery :String,
        @Query("page")pageNumber : Int =1 ,
        @Query("apiKey")
        apiKey : String =API_KEY
    ):Response<newsResponse>
}