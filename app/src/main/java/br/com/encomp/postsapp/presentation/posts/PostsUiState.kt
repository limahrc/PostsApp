package br.com.encomp.postsapp.presentation.posts

import br.com.encomp.postsapp.data.model.Post

sealed interface PostsUiState {
    object Loading : PostsUiState
    data class Success(val posts: List<Post>) : PostsUiState
    data class Error(val message: String) : PostsUiState
}
