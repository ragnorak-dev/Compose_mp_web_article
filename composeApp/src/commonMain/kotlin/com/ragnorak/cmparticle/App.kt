package com.ragnorak.cmparticle

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.ragnorak.cmparticle.dimensions.DimensionFactory
import com.ragnorak.cmparticle.dimensions.DimensionResources
import com.ragnorak.cmparticle.dimensions.DimensionType
import com.ragnorak.cmparticle.dimensions.LocalDimensionResources
import com.ragnorak.cmparticle.dimensions.Resources.dimension
import com.ragnorak.cmparticle.strings.LocalStringResources
import com.ragnorak.cmparticle.strings.StringFactory
import com.ragnorak.cmparticle.strings.StringResources
import com.ragnorak.cmparticle.ui.compact.CompactMainContent
import com.ragnorak.cmparticle.ui.expanded.ExpandedMainContent

@Composable
fun App(
    stringResources: StringResources = StringFactory.createStrings(language),
    dimensionResources: DimensionResources = DimensionFactory.createDimensions(density.value)
) {
    CompositionLocalProvider(
        LocalStringResources provides stringResources,
        LocalDimensionResources provides dimensionResources
    ) {
        MaterialTheme {
            val appState = rememberRanorakAppState()

            if (dimension.dimensionType == DimensionType.COMPACT) {
                CompactMainContent(appState)
            } else {
                ExpandedMainContent(appState)
            }
        }
    }
}