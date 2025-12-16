package com.example.newsreader.data.repository.dataSource

import com.example.newsreader.data.model.ApiResponseDto
import retrofit2.Response

interface RemoteDataSource {
    suspend fun getTopHeadlineNews(country: String, page: Int): Response<ApiResponseDto>
}