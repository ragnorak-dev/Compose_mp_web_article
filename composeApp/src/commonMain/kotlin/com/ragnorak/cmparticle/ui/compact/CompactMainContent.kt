package com.ragnorak.cmparticle.ui.compact

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ragnorak.cmparticle.RanorakAppState
import com.ragnorak.cmparticle.ui.Content
import com.ragnorak.cmparticle.ui.component.ChangeDimensionComponent
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CompactMainContent(appState: RanorakAppState) {
    Scaffold(
        backgroundColor = Color.Transparent,
        scaffoldState = appState.scaffoldState,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Content(appState)
                ChangeDimensionComponent()
            }
        }
    }
}