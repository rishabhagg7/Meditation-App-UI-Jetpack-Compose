package com.example.meditationuijetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationuijetpack.ui.HomeScreen
import com.example.meditationuijetpack.ui.theme.MeditationUIJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIJetpackTheme {
                HomeScreen()
            }
        }
    }
}
