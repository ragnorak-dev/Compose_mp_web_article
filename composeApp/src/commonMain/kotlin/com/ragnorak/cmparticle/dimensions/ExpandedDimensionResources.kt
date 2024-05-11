package com.ragnorak.cmparticle.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ExpandedDimensionResources : DimensionResources {
    override val dimensionType: DimensionType
        get() = DimensionType.EXPANDED
    override val textSize: TextUnit
        get() = 18.sp
    override val logoImageSize: Dp
        get() = 150.dp
    override val iconFlagSize: Dp
        get() = 30.dp


    override val paddingS: Dp
        get() = 8.dp
    override val paddingM: Dp
        get() = 16.dp
    override val paddingL: Dp
        get() = 32.dp
    override val paddingXL: Dp
        get() = 64.dp
}