package com.jesushzc.translator_kmm.translate.data.local

import android.content.Context
import com.jesushzc.translator_kmm.database.TranslatorDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context: Context
) {

    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(TranslatorDatabase.Schema, context, "translate.db")
    }

}