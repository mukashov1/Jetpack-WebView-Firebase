package com.example.jet2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun SplashScreen(navController: NavController) {

    println("SPLASH SCREEN")
    val viewModel: SplashScreenViewModel = viewModel()

    if (viewModel.isMorning.value) {
        navController.navigate(Screen.WebViewScreen.route)
    } else {
        navController.navigate(Screen.TestScreen.route)
    }
}
