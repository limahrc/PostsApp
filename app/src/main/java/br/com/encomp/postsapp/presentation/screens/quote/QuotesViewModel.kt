package br.com.encomp.postsapp.presentation.screens.quote

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.encomp.postsapp.data.repository.PostsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class QuotesViewModel : ViewModel() {

    private val repository = PostsRepository()

    private val _uiState = MutableStateFlow<QuotesUiState>(QuotesUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        getQuotes()
    }

    private fun getQuotes() {
        viewModelScope.launch {
            _uiState.value = QuotesUiState.Loading
            try {
                val quotes = repository.getQuotes()
                _uiState.value = QuotesUiState.Success(quotes)
            } catch (e: Exception) {
                _uiState.value = QuotesUiState.Error(e.message.toString())
            }
        }
    }
}