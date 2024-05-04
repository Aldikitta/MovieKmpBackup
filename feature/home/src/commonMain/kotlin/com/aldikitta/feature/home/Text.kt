package com.aldikitta.feature.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TextFromOtherModule(greeting: String) {
    Text("Compose: $greeting")
}