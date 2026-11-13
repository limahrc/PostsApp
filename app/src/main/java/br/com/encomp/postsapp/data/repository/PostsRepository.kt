package br.com.encomp.postsapp.data.repository

import br.com.encomp.postsapp.data.api.NetworkClient
import br.com.encomp.postsapp.data.model.Post
import br.com.encomp.postsapp.data.model.Quote

class PostsRepository {
    suspend fun getPosts(): List<Post> {
        return NetworkClient.api.getPosts().posts
    }

    suspend fun getQuotes(): List<Quote> {
        return NetworkClient.api.getQuotes().quotes
    }
}
