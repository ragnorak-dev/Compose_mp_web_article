package com.ragnorak.cmparticle

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import kotlinx.coroutines.CoroutineScope

@Composable
expect fun rememberRanorakAppState(): RanorakAppState

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
@Stable
expect class RanorakAppState {

    val scaffoldState: ScaffoldState
    val coroutineScope: CoroutineScope
    val currentRoute: String?

    fun navigateToRoute(route: String)
    fun upPress()
}

