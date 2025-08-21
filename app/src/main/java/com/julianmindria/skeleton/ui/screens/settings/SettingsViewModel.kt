// ui/screens/settings/SettingsViewModel.kt
package com.julianmindria.skeleton.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.julianmindria.skeleton.domain.repo.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import javax.inject.Inject

data class SettingsState(
    val language: String = "en",
    val theme: String = "system",
    val notifEnabled: Boolean = true
)

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val repo: SettingsRepository
) : ViewModel() {

    private val _state = MutableStateFlow(SettingsState())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            combine(repo.language, repo.theme, repo.notifEnabled) { l, t, n ->
                SettingsState(l, t, n)
            }.collect { _state.value = it }
        }
    }

    fun setLanguage(code: String) = viewModelScope.launch { repo.updateLanguage(code) }
    fun setTheme(mode: String) = viewModelScope.launch { repo.updateTheme(mode) }
    fun setNotifications(enabled: Boolean) = viewModelScope.launch { repo.setNotifications(enabled) }

    // ⬇️ Add these so your DataStorageSection() callbacks compile
    fun backup()       = viewModelScope.launch { repo.backup() }
    fun restore()      = viewModelScope.launch { repo.restore() }
    fun exportData()   = viewModelScope.launch { repo.exportData() }
    fun importData()   = viewModelScope.launch { repo.importData() }
    fun resetAll()     = viewModelScope.launch { repo.resetAll() }
}
