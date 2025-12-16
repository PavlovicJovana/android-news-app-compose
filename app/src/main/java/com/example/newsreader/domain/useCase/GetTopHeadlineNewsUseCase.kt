package com.example.newsreader.domain.useCase

import com.example.newsreader.domain.repository.NewsRepository

class GetTopHeadlineNewsUseCase(private val repository: NewsRepository) {
    suspend operator fun invoke(country: String, page: Int) =
        repository.getTopHeadlineNews(country, page)
}