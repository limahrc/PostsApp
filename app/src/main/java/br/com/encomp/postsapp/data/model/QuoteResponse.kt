package br.com.encomp.postsapp.data.model

class QuoteResponse(
    val quotes : List<Quote>
)

data class Quote (
    val id: Int,
    val quote: String,
    val author: String
)