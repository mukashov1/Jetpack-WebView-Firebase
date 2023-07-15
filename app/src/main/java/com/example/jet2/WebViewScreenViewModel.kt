package com.example.jet2

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class WebViewScreenViewModel : ViewModel() {
    val websiteUrl = mutableStateOf("https://mukashov1.github.io/")
}
