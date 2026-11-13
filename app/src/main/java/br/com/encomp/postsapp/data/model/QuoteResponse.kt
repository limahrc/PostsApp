package br.com.encomp.postsapp.data.model

data class QuoteResponse(
    val quotes: List<Quote>
)

data class Quote(
    val id: Int,
    val quote: String,
    val author: String
)