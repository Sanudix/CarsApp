package com.example.carsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.carsapp.navigation.AppNavGraph
import com.example.carsapp.ui.feature.home.MainScreen
import com.example.carsapp.viewmodel.CarViewModel
import com.example.carsapp.viewmodel.CategoryViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavGraph()
        }
    }
}