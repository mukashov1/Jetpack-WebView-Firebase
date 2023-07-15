package com.example.jet2

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TestScreenViewModel : ViewModel() {
    val showHello = mutableStateOf(false)

    fun onButtonClick() {
        showHello.value = true
    }
}
