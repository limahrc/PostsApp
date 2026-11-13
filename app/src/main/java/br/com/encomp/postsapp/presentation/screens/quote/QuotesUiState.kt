package br.com.encomp.postsapp.presentation.screens.quote

import br.com.encomp.postsapp.data.model.Post
import br.com.encomp.postsapp.data.model.Quote

sealed interface QuotesUiState {
    object Loading : QuotesUiState
    data class Success(val quotes: List<Quote>) : QuotesUiState
    data class Error(val message: String) : QuotesUiState
}