package br.com.encomp.postsapp.data.api

import br.com.encomp.postsapp.data.model.PostResponse
import br.com.encomp.postsapp.data.model.QuoteResponse
import retrofit2.http.GET

interface PostsApi {
    @GET("posts")
    suspend fun getPosts(): PostResponse

    @GET("quotes")
    suspend fun getQuotes() : QuoteResponse
}
