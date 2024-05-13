package com.ragnorak.cmparticle.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.ragnorak.cmparticle.RanorakAppState
import com.ragnorak.cmparticle.dimensions.DimensionType
import com.ragnorak.cmparticle.dimensions.Resources.dimension
import com.ragnorak.cmparticle.strings.Resources.strings
import com.ragnorak.cmparticle.ui.component.LanguageComponent
import composempwebarticle.composeapp.generated.resources.Res
import composempwebarticle.composeapp.generated.resources.ragnorak_background_juntos_2_colores
import org.jetbrains.compose.resources.painterResource


@Composable
fun Content(appState: RanorakAppState) {

    Column(
        modifier =
        Modifier
            .fillMaxWidth()
            .padding(dimension.paddingL),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            alignment = Alignment.TopCenter,
            painter = painterResource(Res.drawable.ragnorak_background_juntos_2_colores),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(dimension.logoImageSize)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        LanguageComponent()
        Text(
            text = strings.greet,
            fontSize = dimension.textSize
        )
        Text(
            text = "${strings.compact} ${dimension.dimensionType == DimensionType.COMPACT}",
            fontSize = dimension.textSize
        )
        Text(
            text = "${strings.expanded} ${dimension.dimensionType == DimensionType.EXPANDED}",
            fontSize = dimension.textSize
        )
        Text(
            text = strings.demo,
            fontSize = dimension.textSize
        )
    }
}