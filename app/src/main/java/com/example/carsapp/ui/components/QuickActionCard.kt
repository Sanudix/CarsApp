package com.example.carsapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carsapp.R

@Composable
fun QuickActionCard(
    icon: Int,
    title: String,
    modifier: Modifier = Modifier,
    onCLick: () -> Unit = {}
){
    Column(
        modifier
            .clip(RoundedCornerShape(10.dp))
            .background(colorResource(R.color.grey))
            .clickable{onCLick()}.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(icon),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 64.dp)
        )
        Text(
            text = title,
            color = colorResource(R.color.black),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview
fun QuickActionCardPreview() {
    QuickActionCard(
        R.drawable.ic_launcher_background,
        "Example Title"
    ) { }
}