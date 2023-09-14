package com.jesushzc.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

class IOSMutableStateFlow<T>(
    val initValue: T
): CommonMutableStateFlow<T>(MutableStateFlow(initValue))