package com.ragnorak.cmparticle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize


@OptIn(ExperimentalComposeUiApi::class)
actual val windowSize: IntSize
    @Composable
    get() = LocalWindowInfo.current.containerSize

actual var density: MutableState<Density> = mutableStateOf( Density(density = 1f))
