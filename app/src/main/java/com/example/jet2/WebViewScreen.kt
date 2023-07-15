package com.example.jet2

import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun WebViewScreen(viewModel: WebViewScreenViewModel = viewModel()) {
    val websiteUrl = rememberSaveable { viewModel.websiteUrl.value }

    println("WEBVIEW SCREEN")
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                loadUrl(websiteUrl)
                isClickable = true
            }
        }
    )
}
