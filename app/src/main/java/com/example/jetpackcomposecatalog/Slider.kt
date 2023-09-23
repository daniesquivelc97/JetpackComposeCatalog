package com.example.jetpackcomposecatalog

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun MyBasicSlider() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun MyAdvanceSlider() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    var completeValue by remember { mutableStateOf("") }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Slider(
            value = sliderPosition, onValueChange = { sliderPosition = it },
            onValueChangeFinished = { completeValue = sliderPosition.toString() },
            valueRange = 0f..10f, steps = 9,
            enabled = false
        )
        Text(text = completeValue)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyRangeSlider() {
    var currentRange by remember { mutableStateOf(0f..10f) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        RangeSlider(
            value = currentRange,
            onValueChange = { currentRange = it },
            valueRange =  0f..10f,
            steps = 9
        )
        Text(text = "Valor inferior ${currentRange.start}" )
        Text(text = "Valor Superior ${currentRange.endInclusive}" )
    }
}