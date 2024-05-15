package com.example.movieapp_jetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationUtils.BannerScreen) {
        composable(NavigationUtils.BannerScreen) {
            BannerScreen(navController = navController)
        }
        composable(NavigationUtils.HomeScreen) {
            HomeScreen(navController = navController)
        }
        composable("${NavigationUtils.DetailsScreen}/{id}",
            arguments = listOf(
                navArgument(name = "id"){
                    type = NavType.IntType
                }
            )
        ){id ->
            id.arguments?.getInt("id")?.also {id ->
                DetailsScreen(id = id)
            }
        }
    }

}

