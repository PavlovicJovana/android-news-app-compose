package com.example.newsreader.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.newsreader.domain.useCase.GetTopHeadlineNewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    getTopHeadlineNewsUseCase: GetTopHeadlineNewsUseCase
) : ViewModel() {

}