package com.example.newsreader.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponseDto(
    @SerializedName("articles")
    val articles: List<ArticleDto>?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?
)