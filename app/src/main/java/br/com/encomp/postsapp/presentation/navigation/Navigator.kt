package br.com.encomp.postsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.encomp.postsapp.presentation.screens.home.HomeScreen
import kotlinx.serialization.Serializable
import br.com.encomp.postsapp.presentation.screens.posts.PostsScreen
import br.com.encomp.postsapp.presentation.screens.quote.QuotesScreen

@Serializable
object Home

@Serializable
object Posts

@Serializable
object Quotes


@Composable
fun AppNavHost(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                onNavigateToPosts = { navHostController.navigate(Posts) },
                onNavigateToQuotes = { navHostController.navigate(Quotes) }
            )
        }
        composable<Posts> {
            PostsScreen()
        }
        composable<Quotes> {
            QuotesScreen()
        }
    }
}