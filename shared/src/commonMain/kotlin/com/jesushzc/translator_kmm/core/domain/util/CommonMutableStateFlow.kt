package com.jesushzc.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

expect class CommonMutableStateFlow<T>(flow: MutableStateFlow<T>): MutableStateFlow<T>

fun <T> MutableStateFlow<T>.toCommonMutableStateFlow(): CommonMutableStateFlow<T> = CommonMutableStateFlow(this)