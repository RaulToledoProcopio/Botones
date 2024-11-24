package com.example.botones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.botones.Componentes.Objetivos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Objetivos()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Objetivos()
}
