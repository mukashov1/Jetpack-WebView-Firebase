package com.example.jet2

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.time.LocalTime

class SplashScreenViewModel() : ViewModel() {
    val isMorning = mutableStateOf(LocalTime.now() in LocalTime.of(9, 0)..LocalTime.of(20, 0))
}
