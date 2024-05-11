package com.ragnorak.cmparticle.navigation

import androidx.compose.runtime.mutableStateListOf

class NavigationStack<T>(initial: T) {
    private val stack = mutableStateListOf(initial)
    fun push(t: T) {
        stack.add(t)
    }

    fun replaceBy(t: T) {
        stack.removeLast()
        stack.add(t)
    }

    fun back() {
        if(stack.size > 1) {
            // Always keep one element on the view stack
            stack.removeLast()
        }
    }

    fun lastWithIndex() = stack.withIndex().last()
}