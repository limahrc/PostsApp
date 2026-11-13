package br.com.encomp.postsapp.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToPosts: () -> Unit,
    onNavigateToQuotes: () -> Unit
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "Clique abaixo para ver os posts"
        )
        Button(
            onClick = onNavigateToPosts
        ) {
            Text(text = "Go to Posts")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Clique abaixop para ver os quotes"
        )
        Button(
            onClick = onNavigateToQuotes
        ) {
            Text(text = "Go to Quotes")
        }
    }
}