package br.com.encomp.postsapp.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.encomp.postsapp.presentation.Toolbar

@Composable
fun HomeScreen(
    onNavigateToPosts: () -> Unit,
    onNavigateToQuotes: () -> Unit
) {
    Scaffold(
        topBar = { Toolbar(text = "Home") }
    ) {
        ScreenContent(
            modifier = Modifier.padding(it),
            onNavigateToPosts = onNavigateToPosts,
            onNavigateToQuotes = onNavigateToQuotes
        )
    }
}

@Composable
private fun ScreenContent(
    modifier: Modifier = Modifier,
    onNavigateToPosts: () -> Unit,
    onNavigateToQuotes: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Clique abaixo para ver os posts"
        )
        Button(
            onClick = onNavigateToPosts,
        ) {
            Text(text = "Go to Posts")
        }
        Text(
            text = "Clique abaixo para ver os quotes"
        )
        Button(
            onClick = onNavigateToQuotes
        ) {
            Text(text = "Go to Quotes")
        }
    }
}