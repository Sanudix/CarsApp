package com.example.carsapp.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.carsapp.domain.CategoryModel

@Composable
fun CategoryList(
    categories: List<CategoryModel>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(8.dp)
    ) {
        items(categories) {category ->
            Column(modifier = Modifier
                .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier
                    .size(55.dp)
                    .background(
                        color = Color.Black,
                        shape = CircleShape
                    ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(category.picUrl),
                            contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                    )
                }
                Text(
                    text = category.title,
                    color = Color.Black,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun CategoryListPreview() {
    // Создаем тестовые данные
    val sampleCategories = listOf(
        CategoryModel("1", "Category 1"),
        CategoryModel("2", "Category 2"),
        CategoryModel("3", "Category 3"),
        CategoryModel("4", "Category 4"),
        CategoryModel("5", "Category 5"),
    )

    CategoryList(
        categories = sampleCategories,
        modifier = Modifier.fillMaxWidth()
    )
}