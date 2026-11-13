package br.com.encomp.postsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.encomp.postsapp.presentation.screens.home.HomeScreen
import kotlinx.serialization.Serializable
import androidx.lifecycle.viewmodel.compose.viewModel
import br.com.encomp.postsapp.presentation.posts.PostsScreen
import br.com.encomp.postsapp.presentation.posts.PostsViewModel

@Serializable
object Home

@Serializable
object Posts


@Composable
fun AppNavHost(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                onNavigate = { navHostController.navigate(Posts) }
            )
        }
        composable<Posts> {
            PostsScreen()
        }
    }
}