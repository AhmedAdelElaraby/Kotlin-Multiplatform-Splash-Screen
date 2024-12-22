package com.workdev.example.ui.Navigation

sealed class StateScreens (val route: String) {
    object StateSplashScreen : StateScreens("SplashScreen")
    object StateHomeScreen : StateScreens("HomeScreen")

}