package com.example.newsreader.data.repository

import com.example.newsreader.data.mappers.toDomain
import com.example.newsreader.data.repository.dataSource.RemoteDataSource
import com.example.newsreader.domain.model.Article
import com.example.newsreader.domain.repository.NewsRepository
import com.example.newsreader.domain.util.Resource

class NewsRepositoryImpl(private val remoteDataSource: RemoteDataSource) : NewsRepository {
    override suspend fun getTopHeadlineNews(country: String, page: Int): Resource<List<Article>> {
        return try {
            val response = remoteDataSource.getTopHeadlineNews(country, page)

            if (response.isSuccessful) {
                val articles = response.body()
                    ?.articles
                    .orEmpty()
                    .mapNotNull { dto -> dto.toDomain() }

                Resource.Success(articles)
            } else {
                Resource.Error(message = response.message().ifBlank { "HTTP ${response.code()}" })
            }
        } catch (e: Exception) {
            Resource.Error(message = e.message ?: "Network error")
        }
    }
}