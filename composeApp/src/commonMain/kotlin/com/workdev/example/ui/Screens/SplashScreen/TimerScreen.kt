package com.workdev.example.ui.Screens.SplashScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun Timer(navController: NavHostController){

    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate("HomeScreen") {
            popUpTo("SplashScreen") { inclusive = true }
        }
    }
}