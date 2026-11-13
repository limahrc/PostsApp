package br.com.encomp.postsapp.presentation

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(
    text: String
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = text)
        },
    )
}