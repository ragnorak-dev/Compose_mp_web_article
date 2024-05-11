package com.ragnorak.cmparticle.dimensions

import androidx.compose.ui.unit.Density

object DimensionFactory {
    fun createDimensions(density: Density): DimensionResources =
        when {
            density.density > 2 -> CompactDimensionResources()
        else -> ExpandedDimensionResources()
    }
}