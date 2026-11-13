package br.com.encomp.postsapp.presentation.screens.quote

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.encomp.postsapp.data.repository.PostsRepository
import br.com.encomp.postsapp.presentation.screens.posts.PostsUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class QuotesViewModel : ViewModel() {
    private val repository = PostsRepository()
    private val _uiState = MutableStateFlow<QuotesUiState>(QuotesUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        fetchQuotes()
    }

    private fun fetchQuotes(){
        viewModelScope.launch{
            _uiState.value = QuotesUiState.Loading
            try {
                val quotes = repository.getQuotes()
                _uiState.value = QuotesUiState.Success(quotes)
            }catch (e : Exception){
                _uiState.value = QuotesUiState.Error(e.message.toString())
            }
        }

    }
}