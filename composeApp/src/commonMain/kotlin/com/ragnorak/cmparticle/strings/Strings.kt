package com.ragnorak.cmparticle.strings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalStringResources: ProvidableCompositionLocal<StringResources> =
    staticCompositionLocalOf {
        EsStringResources()
        EnStringResources()
    }

object Resources {
    val strings: StringResources
        @Composable
        @ReadOnlyComposable
        get() = LocalStringResources.current
}