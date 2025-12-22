package com.example.newsreader.presentation.di

import com.example.newsreader.domain.repository.NewsRepository
import com.example.newsreader.domain.useCase.GetTopHeadlineNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetTopHeadlineNewsUseCase(repository: NewsRepository): GetTopHeadlineNewsUseCase {
        return GetTopHeadlineNewsUseCase(repository)
    }
}