// data/repo/SettingsRepositoryImpl.kt
package com.julianmindria.skeleton.data.repo

import com.julianmindria.skeleton.data.prefs.AppPreferences
import com.julianmindria.skeleton.domain.repo.SettingsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepositoryImpl @Inject constructor(
    private val prefs: AppPreferences
) : SettingsRepository {
    override val language: Flow<String> = prefs.language
    override val theme: Flow<String> = prefs.theme
    override val notifEnabled: Flow<Boolean> = prefs.notifEnabled

    override suspend fun updateLanguage(code: String) = prefs.setLanguage(code)
    override suspend fun updateTheme(mode: String) = prefs.setTheme(mode)
    override suspend fun setNotifications(enabled: Boolean) = prefs.setNotifEnabled(enabled)

    override suspend fun backup() = Result.success(Unit)
    override suspend fun restore() = Result.success(Unit)
    override suspend fun resetAll() = Result.success(Unit)
    override suspend fun exportData() = Result.success(Unit)
    override suspend fun importData() = Result.success(Unit)
}
