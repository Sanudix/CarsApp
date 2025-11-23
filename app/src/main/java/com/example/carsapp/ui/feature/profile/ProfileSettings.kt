package com.example.carsapp.ui.feature.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carsapp.R
import com.example.carsapp.ui.components.SettingsRow

@Composable
@Preview
fun ProfileSettings() {
    Column() {
        SettingsRow(
            icon = R.drawable.review,
            title = "Rating and Review",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
        )
        SettingsRow(
            icon = R.drawable.contact,
            title = "Contact Support",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        SettingsRow(
            icon = R.drawable.social,
            title = "Social Media Link",
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
        )
    }
}