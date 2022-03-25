package com.foggyskies.petapp.presentation.ui.home.animations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates

data class ShowCaseProperty(
    val index: Int = 0,
    val coordinate: LayoutCoordinates? = null,
    val title: String = "",
    val subTitle: String = "",
    val titleColor: Color = Color.White,
    val subTitleColor: Color = Color.White
)