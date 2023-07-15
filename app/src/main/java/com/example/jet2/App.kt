package com.example.jet2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.MutableData
import com.google.firebase.database.Transaction
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

@Composable
fun App() {

    incrementValue("app")
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.SplashScreen.route) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController)
            incrementValue("splash")
        }
        composable(Screen.WebViewScreen.route) {
            WebViewScreen()
            incrementValue("webview")
        }
        composable(Screen.TestScreen.route) {
            TestScreen()
            incrementValue("test")
        }
    }

}

fun incrementValue(path: String) {
    val valueRef = Firebase.database.reference.child("launch").child(path)

    valueRef.runTransaction(object : Transaction.Handler {
        override fun doTransaction(currentData: MutableData): Transaction.Result {
            currentData.value = (currentData.value.toString().toIntOrNull() ?: 0) + 1
            return Transaction.success(currentData)
        }

        override fun onComplete(
            error: DatabaseError?,
            committed: Boolean,
            currentData: DataSnapshot?
        ) {
            println("Transaction Result: ${error ?: "Success"} ")
        }
    })
}
