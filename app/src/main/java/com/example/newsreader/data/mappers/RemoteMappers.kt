package com.example.newsreader.data.mappers

import com.example.newsreader.data.model.ArticleDto
import com.example.newsreader.domain.model.Article

fun ArticleDto.toDomain(): Article? =
    url?.let {
        Article(
            author = author.orEmpty(),
            content = content.orEmpty(),
            description = description.orEmpty(),
            publishedAt = publishedAt.orEmpty(),
            sourceName = source?.name.orEmpty(),
            title = title.orEmpty(),
            url = it,
            urlToImage = urlToImage
        )
    }