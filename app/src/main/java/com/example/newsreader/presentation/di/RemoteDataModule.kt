package com.example.newsreader.presentation.di

import com.example.newsreader.data.api.NewsApiService
import com.example.newsreader.data.repository.dataSource.RemoteDataSource
import com.example.newsreader.data.repository.dataSourceImpl.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
    @Provides
    @Singleton
    fun provideRemoteDataSource(service: NewsApiService): RemoteDataSource {
        return RemoteDataSourceImpl(service)
    }
}