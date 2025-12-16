package com.example.newsreader.domain.repository

import com.example.newsreader.domain.model.Article
import com.example.newsreader.domain.util.Resource

interface NewsRepository {
    suspend fun getTopHeadlineNews(country: String, page: Int): Resource<List<Article>>
}