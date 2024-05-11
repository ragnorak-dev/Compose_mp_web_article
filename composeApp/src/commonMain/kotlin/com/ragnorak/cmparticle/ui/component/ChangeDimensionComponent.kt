package com.ragnorak.cmparticle.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Density
import com.ragnorak.cmparticle.density
import com.ragnorak.cmparticle.dimensions.DimensionType
import com.ragnorak.cmparticle.dimensions.Resources.dimension
import com.ragnorak.cmparticle.strings.Resources.strings

@Composable
fun ChangeDimensionComponent() {
    if (dimension.dimensionType == DimensionType.COMPACT) {
        CompactChangeDimensionComponent()
    } else {
        ExpandedChangeDimensionComponent()
    }
}

@Composable
private fun CompactChangeDimensionComponent() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimension.paddingM)
    ) {
        ChangeDimensionButtons()
    }
}

@Composable
private fun ExpandedChangeDimensionComponent() {
    Column (
        verticalArrangement = Arrangement.spacedBy(dimension.paddingM)
    ) {
        ChangeDimensionButtons()
    }
}

@Composable
private fun ChangeDimensionButtons() {
    Button(
        onClick = {
            density.value = Density(density = 2.5f)
        }
    ) {
        Text(
            text = strings.setCompact,
            fontSize = dimension.textSize
        )
    }
    Button(
        onClick = {
            density.value = Density(density = 1f)
        }
    ) {
        Text(
            text = strings.setExpanded,
            fontSize = dimension.textSize
        )
    }
}