package com.workdev.example.ui.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.workdev.example.ui.Screens.HomeScreen.HomeScreen
import com.workdev.example.ui.Screens.SplashScreen.SplashScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = StateScreens.StateSplashScreen.route
    ) {
        composable(StateScreens.StateSplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(StateScreens.StateHomeScreen.route) {
            HomeScreen()
        }

    }



}