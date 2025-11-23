package com.example.carsapp.ui.feature.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.carsapp.R
import com.example.carsapp.ui.components.TopBar

@Composable
fun DetailHeader(
    picUrl: String?,
    onBack: () -> Unit,
    onFav: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .background(colorResource(R.color.black))
            .statusBarsPadding()
    ) {
        TopBar(
            title = "Car Detail",
            backIconRes = R.drawable.back1,
            trailingIconRes = R.drawable.fav_icon,
            onBack = onBack,
            modifier = Modifier,
            onTrailingClick = onFav,
            titleColorRes =  R.color.white
        )
        AsyncImage(
            model = picUrl,
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp, top = 32.dp)
                .fillMaxSize()
                .height(220.dp)
        )
    }
}