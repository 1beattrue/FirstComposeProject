package edu.mirea.onebeattrue.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo(name = "Aboba", age = 15)
        }
    }
}

@Composable
fun UserInfo(name: String, age: Int) {
    Text(
        text = "Name: $name, Age: $age"
    )
}