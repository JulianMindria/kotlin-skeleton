// ui/screens/settings/SettingsScreen.kt
package com.julianmindria.skeleton.ui.screens.settings

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.julianmindria.skeleton.ui.screens.settings.sections.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    vm: SettingsViewModel = hiltViewModel()
) {
    val state by vm.state.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Settings") },
                navigationIcon = {
                    IconButton(onClick = onBack) { Icon(Icons.Filled.ArrowBack, null) }
                }
            )
        }
    ) { pad ->
        LazyColumn(contentPadding = pad) {
            // 100% LOCAL
            item { LanguageSection(state.language) { vm.setLanguage(it) } }
            item { ThemeSection(state.theme) { vm.setTheme(it) } }
            item { NotificationsSection(state.notifEnabled) { vm.setNotifications(it) } }
            item { PrivacySection(onLockSetup = { /* local app lock */ }, onPermissions = { /* app settings */ }) }
            item {
                DataStorageSection(
                    onBackup = vm::backup, onRestore = vm::restore,
                    onExport = vm::exportData, onImport = vm::importData,
                    onReset = vm::resetAll
                )
            }

            // 🚫 CLOUD / EXTERNAL SERVICES — disable for now
            // item { AccountSection(onLogin = { /* TODO when backend ready */ }, onLogout = { /* TODO */ }) }
            // item { SubscriptionSection(onManage = { /* Google Play Billing (network) */ }) }
            // item {
            //     HelpSupportSection(
            //         onFAQ = { /* opens web URL */ },
            //         onContact = { /* email intent */ },
            //         onReport = { /* web form / email */ }
            //     )
            // }

            // LOCAL about (no outbound links)
            item { AboutSectionLocal() }

            // Optional: these are outbound intents but no server of yours
            // Comment if you want *strictly* no external intents yet.
            // item { FeedbackSection(onRate = { /* market://details?id=... */ }, onShare = { /* share sheet */ }) }

            item { Spacer(Modifier.height(24.dp)) }
        }
    }
}
