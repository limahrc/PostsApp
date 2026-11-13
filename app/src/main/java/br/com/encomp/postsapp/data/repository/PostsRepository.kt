package br.com.encomp.postsapp.data.repository

import br.com.encomp.postsapp.data.api.NetworkClient
import br.com.encomp.postsapp.data.model.Post

class PostsRepository {
    suspend fun getPosts(): List<Post> {
        return NetworkClient.api.getPosts().posts
    }
}
