package com.example.movieapp_jetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


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
    }

}

