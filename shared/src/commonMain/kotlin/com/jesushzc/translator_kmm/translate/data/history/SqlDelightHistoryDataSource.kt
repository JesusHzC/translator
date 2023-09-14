package com.jesushzc.translator_kmm.translate.data.history

import com.jesushzc.translator_kmm.core.domain.util.CommonFlow
import com.jesushzc.translator_kmm.core.domain.util.toCommonFlow
import com.jesushzc.translator_kmm.database.TranslatorDatabase
import com.jesushzc.translator_kmm.translate.domain.history.HistoryDataSource
import com.jesushzc.translator_kmm.translate.domain.history.HistoryItem
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import kotlinx.coroutines.flow.map
import kotlinx.datetime.Clock

class SqlDelightHistoryDataSource(
    db: TranslatorDatabase
): HistoryDataSource {

    private val queries = db.translateQueries

    override fun getHistory(): CommonFlow<List<HistoryItem>> {
        return queries.getHistory()
            .asFlow()
            .mapToList()
            .map {  history ->
                history.map { it.toHistoryItem() }
            }
            .toCommonFlow()
    }

    override suspend fun insertHistoryItem(item: HistoryItem) {
        queries.insertHistoryEntity(
            id = item.id,
            fromLanguageCode = item.fromLanguageCode,
            fromText = item.fromText,
            toLanguageCode = item.toLanguageCode,
            toText = item.toText,
            timestamp = Clock.System.now().toEpochMilliseconds()
        )
    }
}