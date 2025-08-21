package com.julianmindria.skeleton.data.prefs

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import javax.inject.Inject
import kotlinx.coroutines.flow.map

object PrefKeys {
    val LANGUAGE = stringPreferencesKey("language")
    val THEME = stringPreferencesKey("theme")
    val NOTIF_ENABLED = booleanPreferencesKey("notif_enabled")
}

class AppPreferences @Inject constructor(
    private val ds: DataStore<Preferences>
) {
    val language = ds.data.map { it[PrefKeys.LANGUAGE] ?: "en" }
    val theme = ds.data.map { it[PrefKeys.THEME] ?: "system" }
    val notifEnabled = ds.data.map { it[PrefKeys.NOTIF_ENABLED] ?: true }

    suspend fun setLanguage(v: String) {
        ds.edit { it[PrefKeys.LANGUAGE] = v }
    }
    suspend fun setTheme(v: String) {
        ds.edit { it[PrefKeys.THEME] = v }
    }
    suspend fun setNotifEnabled(v: Boolean) {
        ds.edit { it[PrefKeys.NOTIF_ENABLED] = v }
    }
}