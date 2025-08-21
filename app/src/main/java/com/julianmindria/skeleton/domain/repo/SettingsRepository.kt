package com.julianmindria.skeleton.domain.repo

import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    val language: Flow<String>
    val theme: Flow<String>
    val notifEnabled: Flow<Boolean>

    suspend fun updateLanguage(code: String)
    suspend fun updateTheme(mode: String)
    suspend fun setNotifications(enabled: Boolean)

    suspend fun backup(): Result<Unit>
    suspend fun restore(): Result<Unit>
    suspend fun resetAll(): Result<Unit>
    suspend fun exportData(): Result<Unit>
    suspend fun importData(): Result<Unit>
}
