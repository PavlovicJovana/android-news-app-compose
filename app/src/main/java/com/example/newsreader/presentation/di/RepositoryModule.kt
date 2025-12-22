package com.example.newsreader.presentation.di

import com.example.newsreader.data.repository.NewsRepositoryImpl
import com.example.newsreader.data.repository.dataSource.RemoteDataSource
import com.example.newsreader.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepositoryModule(remoteDataSource: RemoteDataSource): NewsRepository {
        return NewsRepositoryImpl(remoteDataSource)
    }
}