package com.example.carsapp.ui.feature.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carsapp.R
import com.example.carsapp.ui.components.SpecCard

@Composable
fun DetailSpecs(
    totalCapacity: String,
    highestSpeed: String,
    engineOutput: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SpecCard(R.drawable.sit, "Total\nCapacity", totalCapacity, Modifier.weight(1f))
        SpecCard(R.drawable.speed, "Highest\nSpeed", highestSpeed, Modifier.weight(1f))
        SpecCard(R.drawable.engine, "Engine\nOutput", engineOutput, Modifier.weight(1f))
    }
}

@Composable
@Preview
fun DetailSpecsPreview() {
    DetailSpecs("Example Capacity", "Sample Speed", "Sample Engine")
}
