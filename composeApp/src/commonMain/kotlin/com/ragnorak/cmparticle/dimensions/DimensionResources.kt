package com.ragnorak.cmparticle.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

interface DimensionResources {
    val dimensionType: DimensionType
    val textSize: TextUnit
    val logoImageSize: Dp
    val iconFlagSize: Dp

    val paddingS: Dp
    val paddingM: Dp
    val paddingL: Dp
    val paddingXL: Dp
}