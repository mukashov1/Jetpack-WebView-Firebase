package com.example.jet2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TestScreen(viewModel: TestScreenViewModel = viewModel()) {
    val showMessage = viewModel.showHello.value

    println("TEST SCREEN")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello")
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Image 1",
                modifier = Modifier.padding(4.dp)
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Image 2",
                modifier = Modifier.padding(4.dp)
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "Image 3",
                modifier = Modifier.padding(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { viewModel.onButtonClick() },
            enabled = !showMessage
        ) {
            Text("Click me")
        }

        if (showMessage) {
            Text("Hello")
        }
    }
}