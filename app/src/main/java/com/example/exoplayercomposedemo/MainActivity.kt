package com.example.exoplayercomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exoplayercomposedemo.screen.ExoPlayerScreen
import com.example.exoplayercomposedemo.ui.theme.ExoPlayerComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExoPlayerComposeDemoTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "exoplayer_screen") {
                    composable("exoplayer_screen") {
                        ExoPlayerScreen()
                    }
                }
            }
        }
    }
}
