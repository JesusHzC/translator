package com.jesushzc.translator_kmm.translate.data.local

import com.jesushzc.translator_kmm.database.TranslatorDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {

    actual fun create(): SqlDriver {
        return NativeSqliteDriver(TranslatorDatabase.Schema, "translate.db")
    }

}