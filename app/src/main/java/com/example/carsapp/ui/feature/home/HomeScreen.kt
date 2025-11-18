package com.example.carsapp.ui.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.carsapp.viewmodel.CategoryViewModel

@Composable
fun MainScreen(categoryViewModel: CategoryViewModel) {

    val categories by categoryViewModel.categories
    val isLoadingCategory by categoryViewModel.isLoading
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffefefef))
        ) {
            item {
                HeaderSection(username = "Alex Johnson", onBellClick = {})
            }
            item {
                SearchSection()
            }
            item {
                if (isLoadingCategory) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center,
                    ) {
                        CircularProgressIndicator()
                    }
                } else {
                    CategoryList(categories)
                }
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    val categoryViewModel = CategoryViewModel()
    MainScreen(categoryViewModel = categoryViewModel)
}