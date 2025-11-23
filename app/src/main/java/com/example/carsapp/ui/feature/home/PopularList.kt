package com.example.carsapp.ui.feature.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.carsapp.R
import com.example.carsapp.domain.CarModel

@Composable
fun PopularList(
    cars: List<CarModel>,
    onCarClick: (CarModel) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp, bottom = 130.dp)
            .fillMaxWidth()
            .height(600.dp)
    ) {
        items(items = cars) { car ->
            Card(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth()
                    .background(color = colorResource(R.color.grey))
                    .clickable { onCarClick(car) },
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ){
                Image(painter = rememberAsyncImagePainter(car.picUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .height(130.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = car.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "$${car.price}",
                    fontSize = 14.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}


@Composable
@Preview
fun PopularListPreview() {
    val cars: List<CarModel> = listOf(
    CarModel (
        title = "Tesla Model S",
        description = "Электрический седан премиум-класса",
        totalCapacity = "5 человек",
        highestSpeed = "250 км/ч",
        engineOutput = "670 л.с.",
        picUrl = "https://example.com/tesla_model_s.jpg",
        price = 85.000,
        rating = 4.8
    ),
    CarModel (
        title = "BMW i8",
        description = "Гибридный спорткар",
        totalCapacity = "2 человека",
        highestSpeed = "280 км/ч",
        engineOutput = "369 л.с.",
        picUrl = "https://example.com/bmw_i8.jpg",
        price = 47.500,
        rating = 4.6
    ),
    CarModel (
        title = "Porsche Taycan",
        description = "Электрический спортивный седан",
        totalCapacity = "4 человека",
        highestSpeed = "260 км/ч",
        engineOutput = "761 л.с.",
        picUrl = "https://example.com/porsche_taycan.jpg",
        price = 105.000,
        rating = 4.9
    ),
    CarModel (
        title = "Audi e-tron",
        description = "Электрический кроссовер",
        totalCapacity = "5 человек",
        highestSpeed = "200 км/ч",
        engineOutput = "355 л.с.",
        picUrl = "https://example.com/audi_etron.jpg",
        price = 77.400,
        rating = 4.5
    ),
    CarModel (
        title = "Mercedes EQS",
        description = "Люксовый электрический седан",
        totalCapacity = "5 человек",
        highestSpeed = "210 км/ч",
        engineOutput = "516 л.с.",
        picUrl = "https://example.com/mercedes_eqs.jpg",
        price = 102.310,
        rating = 4.7
    )
    )
    PopularList(cars = cars, onCarClick = {})
}
