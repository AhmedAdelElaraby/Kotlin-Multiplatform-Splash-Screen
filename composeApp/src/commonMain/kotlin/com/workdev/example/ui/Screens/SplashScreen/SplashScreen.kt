package com.workdev.example.ui.Screens.SplashScreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun SplashScreen(navController: NavHostController) {

    Timer(navController)

    BodyScreen("Hello Splash Screen !")
}


