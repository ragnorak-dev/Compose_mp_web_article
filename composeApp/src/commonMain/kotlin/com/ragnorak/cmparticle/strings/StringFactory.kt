package com.ragnorak.cmparticle.strings

import androidx.compose.runtime.MutableState

const val ES_LANG = "es"
const val EN_LANG = "en"

object StringFactory {
    fun createStrings(language: MutableState<String>): StringResources =
        when (language.value) {
            ES_LANG -> EsStringResources()
            EN_LANG -> EnStringResources()
            else -> EnStringResources()
        }
}