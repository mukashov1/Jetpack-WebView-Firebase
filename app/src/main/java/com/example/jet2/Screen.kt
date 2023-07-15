package com.example.jet2

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash")
    object WebViewScreen : Screen("webview")
    object TestScreen : Screen("test")
}