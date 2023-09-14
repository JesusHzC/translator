package com.jesushzc.translator_kmm.di

import com.jesushzc.translator_kmm.database.TranslatorDatabase
import com.jesushzc.translator_kmm.translate.data.history.SqlDelightHistoryDataSource
import com.jesushzc.translator_kmm.translate.data.local.DatabaseDriverFactory
import com.jesushzc.translator_kmm.translate.data.remote.HttpClientFactory
import com.jesushzc.translator_kmm.translate.data.translate.KtorTranslateClient
import com.jesushzc.translator_kmm.translate.domain.history.HistoryDataSource
import com.jesushzc.translator_kmm.translate.domain.translate.TranslateClient
import com.jesushzc.translator_kmm.translate.domain.translate.TranslateUseCase

class AppModule {
    val historyDataSource: HistoryDataSource by lazy {
        SqlDelightHistoryDataSource(
            TranslatorDatabase(
                DatabaseDriverFactory().create()
            )
        )
    }

    private val translateClient: TranslateClient by lazy {
        KtorTranslateClient(
            HttpClientFactory().create()
        )
    }

    val translateUseCase: TranslateUseCase by lazy {
        TranslateUseCase(translateClient, historyDataSource)
    }
}