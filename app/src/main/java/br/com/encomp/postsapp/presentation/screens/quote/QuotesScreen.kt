package br.com.encomp.postsapp.presentation.screens.quote

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.encomp.postsapp.data.model.Quote
import br.com.encomp.postsapp.presentation.screens.posts.PostsViewModel


// tela de Quotes
@Composable
fun QuotesScreen(
    viewModel: QuotesViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()

    when (val currentState = state){
        is QuotesUiState.Loading -> CircularProgressIndicator()
        is QuotesUiState.Error -> Text(text = currentState.message)
        is QuotesUiState.Success -> QuoteList(quotes = currentState.quotes)

    }
}

@Composable
fun QuoteItem(
    modifier: Modifier = Modifier,
    quote: Quote
) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ){
        Column(
            modifier = Modifier.padding(8.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(modifier = Modifier.fillMaxWidth(0.65f) ,text = quote.quote, fontWeight = FontWeight.Bold)
                Text(text = quote.id.toString())

            }
            Text(quote.author)
        }
    }
}

@Composable
fun QuoteList(
    modifier: Modifier = Modifier,
    quotes : List<Quote>
) {
    LazyColumn(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        items(quotes){quote ->
            QuoteItem(quote = quote)
        }
    }
}

@Preview
@Composable
fun ScreenPreview() {
    QuotesScreen()
}