package com.ragnorak.cmparticle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize

expect val windowSize: IntSize
    @Composable
    get

expect var density: MutableState<Density>
