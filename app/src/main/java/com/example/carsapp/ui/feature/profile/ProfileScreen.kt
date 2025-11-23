package com.example.carsapp.ui.feature.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carsapp.R

@Composable
@Preview
fun ProfileScreen(onBack:()->Unit = {}){
    val scroll = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 320.dp)
            .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
            .background(colorResource(R.color.white))
    ) {
        ProfileHeader(onBack = onBack)
        Column(
            Modifier.fillMaxSize()
                .padding(top = 320.dp)
                .clip(RoundedCornerShape(topEnd = 50.dp, topStart = 50.dp))
                .background(colorResource(R.color.white))
                .verticalScroll(scroll)
        ) {
            Text(
                text = "Common Function",
                color = colorResource(R.color.black),
                fontSize = 20.sp,
                modifier = Modifier.padding(24.dp),
                fontWeight = FontWeight.Bold
            )
            ProfileQuickActions()
        }
    }
}