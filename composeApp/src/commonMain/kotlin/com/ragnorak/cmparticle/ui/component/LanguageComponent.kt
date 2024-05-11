package com.ragnorak.cmparticle.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ragnorak.cmparticle.dimensions.Resources.dimension
import com.ragnorak.cmparticle.language
import com.ragnorak.cmparticle.strings.EN_LANG
import com.ragnorak.cmparticle.strings.ES_LANG
import composempwebarticle.composeapp.generated.resources.Res
import composempwebarticle.composeapp.generated.resources.spain_flag_icon
import composempwebarticle.composeapp.generated.resources.uk_flag_icon
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.vectorResource


@OptIn(ExperimentalResourceApi::class)
@Composable
fun LanguageComponent() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimension.paddingS)
    ) {
        Icon(
            imageVector = vectorResource(Res.drawable.spain_flag_icon),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(dimension.iconFlagSize)
                .clickable {
                    language.value = ES_LANG
                }
        )
        Icon(
            imageVector = vectorResource(Res.drawable.uk_flag_icon),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(dimension.iconFlagSize)
                .clickable {
                    language.value = EN_LANG
                }
        )
    }
}