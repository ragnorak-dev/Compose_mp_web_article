package com.ragnorak.cmparticle

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.intl.Locale
import com.ragnorak.cmparticle.strings.EN_LANG
import com.ragnorak.cmparticle.strings.ES_LANG

actual var language: MutableState<String> = mutableStateOf(
    if (Locale.current.language == ES_LANG) {
        ES_LANG
    } else {
        EN_LANG
    }
)
