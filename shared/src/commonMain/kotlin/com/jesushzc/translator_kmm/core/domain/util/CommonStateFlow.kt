package com.jesushzc.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

expect class CommonStateFlow<T>(flow: StateFlow<T>): StateFlow<T>

fun <T> StateFlow<T>.toCommonStateFlow(): CommonStateFlow<T> = CommonStateFlow(this)