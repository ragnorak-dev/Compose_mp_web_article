package com.ragnorak.cmparticle.ui.expanded

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ragnorak.cmparticle.RanorakAppState
import com.ragnorak.cmparticle.dimensions.Resources.dimension
import com.ragnorak.cmparticle.ui.Content
import com.ragnorak.cmparticle.ui.component.ChangeDimensionComponent
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ExpandedMainContent(appState: RanorakAppState) {
    Scaffold(
        backgroundColor = Color.Transparent,
        scaffoldState = appState.scaffoldState,
    ) { innerPadding ->
        Row(
            Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = dimension.paddingL, horizontal = dimension.paddingM)
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                ChangeDimensionComponent()
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f),
                horizontalAlignment = Alignment.Start
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Content(appState)
                }
            }
        }
    }
}