package com.example.newsreader.data.repository.dataSourceImpl

import com.example.newsreader.data.api.NewsApiService
import com.example.newsreader.data.model.ApiResponseDto
import com.example.newsreader.data.repository.dataSource.RemoteDataSource
import retrofit2.Response

class RemoteDataSourceImpl(private val service: NewsApiService) : RemoteDataSource {
    override suspend fun getTopHeadlineNews(country: String, page: Int): Response<ApiResponseDto> =
        service.getTopHeadlineNews(country, page)
}