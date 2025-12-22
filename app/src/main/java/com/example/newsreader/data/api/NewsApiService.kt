package com.example.newsreader.data.api

import com.example.newsreader.data.model.ApiResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlineNews(
        @Query("country") country: String,
        @Query("page") page: Int
    ): Response<ApiResponseDto>
}