package com.ragnorak.cmparticle.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CompactDimensionResources : DimensionResources {
    override val dimensionType: DimensionType
        get() = DimensionType.COMPACT
    override val textSize: TextUnit
        get() = 36.sp
    override val logoImageSize: Dp
        get() = 250.dp
    override val iconFlagSize: Dp
        get() = 50.dp

    override val paddingS: Dp
        get() = 8.dp
    override val paddingM: Dp
        get() = 16.dp
    override val paddingL: Dp
        get() = 32.dp
    override val paddingXL: Dp
        get() = 64.dp
}