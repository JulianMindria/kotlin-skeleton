package com.julianmindria.skeleton.ui.screens.settings.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.billingclient.BuildConfig

@Composable
fun AboutSectionLocal(versionName: String = BuildConfig.VERSION_NAME) {
    Card(Modifier.padding(16.dp)) {
        Column(Modifier.padding(16.dp)) {
            Text("About")
            Text("Version: $versionName")
            // Add licenses dialog later if needed; keep offline for now
        }
    }
}
